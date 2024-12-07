package model;
import java.sql.*;
import java.text.SimpleDateFormat;
public class MBookingSeats 
{
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");


    public int userDetails(String idType, String idNumber, String country, String expDate, String lastName, String firstMiddleName, String dob, String email, String phoneNo, int Schedule_ID) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ResultSet rsTrainNo = null;
        int trainNo = -1;  // Default value to indicate no train number found

        try {
            // Establish database connection
            connection = DBConnection.createDBConnection();

            // First, get the train_no from schedule based on Schedule_ID
            String trainQuery = "SELECT Train_No FROM schedule WHERE Schedule_ID = ?";
            ps = connection.prepareStatement(trainQuery);
            ps.setInt(1, Schedule_ID);

            rsTrainNo = ps.executeQuery();
            if (rsTrainNo.next()) {
                trainNo = rsTrainNo.getInt("Train_No");  // Retrieve train number from the result
            } else {
                System.err.println("No train number found for Schedule_ID: " + Schedule_ID);
                return -1;  // Return -1 if no train number is found
            }

            // Now, prepare the insert query for the User table with the retrieved train_no
            String query = "INSERT INTO User (ID_Type, ID_Number, Expiration_Date, English_Last_Name, English_First_and_Middle_Name, Date_of_Birth, Country, Phone_no, Email, Train_No) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            // Set query parameters
            ps.setString(1, idType);
            ps.setString(2, idNumber);
            ps.setString(3, expDate);
            ps.setString(4, lastName);
            ps.setString(5, firstMiddleName);
            ps.setString(6, dob);
            ps.setString(7, country);
            ps.setString(8, phoneNo);
            ps.setString(9, email);
            ps.setInt(10, trainNo);  // Pass the train_no to the User table

            // Execute the query
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                // Retrieve the generated UserId
                rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    int userId = rs.getInt(1); // Get the first column from the generated keys
                    System.out.println("User Details added successfully. UserId: " + userId);
                    return userId;
                }
            } else {
                System.err.println("User Details was not added. No rows affected.");
            }
        } catch (SQLException e) {
            // Log SQL exception details
            System.err.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            // Handle other exceptions
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close resources in reverse order of creation
            try {
                if (rs != null) rs.close();
                if (rsTrainNo != null) rsTrainNo.close();
                if (ps != null) ps.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
        return -1; // Return -1 if insertion failed or no ID was generated
    }


    
    
    public void bookingSeats(String bookingDate, int No_of_Passengers, int Schedule_ID, int USER_ID) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rsTrainCost = null;
        double travelCost = 0;  // Default value to indicate no travel cost found

        try {
            // Establish database connection
            connection = DBConnection.createDBConnection();

            // First, get the Travel_Cost from train table based on Schedule_ID
            String trainCostQuery = "SELECT t.Travel_Cost " +
                                     "FROM train t " +
                                     "JOIN schedule s ON t.Train_No = s.Train_No " +
                                     "WHERE s.Schedule_ID = ?";
            ps = connection.prepareStatement(trainCostQuery);
            ps.setInt(1, Schedule_ID);

            rsTrainCost = ps.executeQuery();
            if (rsTrainCost.next()) {
                travelCost = rsTrainCost.getDouble("Travel_Cost");  // Retrieve travel cost
            } else {
                System.err.println("No travel cost found for Schedule_ID: " + Schedule_ID);
                return;  // Return if no travel cost is found
            }

            // Calculate the total amount by multiplying travel cost with number of passengers
            double totalAmount = travelCost * No_of_Passengers;

            // Now, prepare the insert query for the Booking table
            String bookingQuery = "INSERT INTO booking (Booking_Date, Number_of_Passengers, Total_Amount, Booking_Status, Schedule_ID, User_ID) " +
                                  "VALUES (?, ?, ?, ?, ?, ?)";
            ps = connection.prepareStatement(bookingQuery);

            // Set Booking_Date String to Date
            java.sql.Date sqlBookingDate = new java.sql.Date(dateFormat.parse(bookingDate).getTime());

            // Set query parameters
            ps.setDate(1, sqlBookingDate);
            ps.setInt(2, No_of_Passengers);
            ps.setDouble(3, totalAmount);  // Set the calculated total amount
            ps.setString(4, "Booked");  // Set the Booking_Status as "Booked"
            ps.setInt(5, Schedule_ID);
            ps.setInt(6, USER_ID);

            // Execute the query to insert the booking
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Booking added successfully.");
            } else {
                System.err.println("Booking was not added. No rows affected.");
            }

            // Now, update the Total_Booked_Seats in schedule table by adding No_of_Passengers
            String updateSeatsQuery = "UPDATE schedule SET Total_Booked_Seats = Total_Booked_Seats + ? WHERE Schedule_ID = ?";
            ps = connection.prepareStatement(updateSeatsQuery);
            ps.setInt(1, No_of_Passengers);
            ps.setInt(2, Schedule_ID);

            // Execute the update query to increment the booked seats
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Schedule updated with the new number of booked seats.");
            } else {
                System.err.println("Schedule was not updated. No rows affected.");
            }
        } catch (SQLException e) {
            // Log SQL exception details
            System.err.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            // Handle other exceptions
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close resources in reverse order of creation
            try {
                if (rsTrainCost != null) rsTrainCost.close();
                if (ps != null) ps.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
    }

    
    public Object[] getTrainDetailsByScheduleId(int scheduleId) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Establish database connection
            connection = DBConnection.createDBConnection();

            // Prepare the JOIN query
            String query = "SELECT t.Train_No, t.Travel_Time, t.Departure_Date, t.Departure_Time, t.Departure_Station, t.Arrival_Station, t.Arrival_Time " +
                           "FROM train t " +
                           "JOIN schedule s ON t.Train_No = s.Train_No " +
                           "WHERE s.Schedule_ID = ?";
            ps = connection.prepareStatement(query);
            ps.setInt(1, scheduleId);

            // Execute the query
            rs = ps.executeQuery();
            if (rs.next()) {
                // Return the train details as an Object array
                return new Object[]{
                    rs.getInt("Train_No"),
                    rs.getString("Travel_Time"),
                    rs.getDate("Departure_Date"),
                    rs.getTime("Departure_Time"),
                    rs.getString("Departure_Station"),
                    rs.getString("Arrival_Station"),
                    rs.getTime("Arrival_Time")
                };
            }
        } catch (SQLException e) {
            // Log SQL exception details
            System.err.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close resources in reverse order of creation
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
        return null; // Return null if no data found
        }

}
