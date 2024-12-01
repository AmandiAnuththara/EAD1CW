package model;
import java.sql.*;
import java.text.SimpleDateFormat;
public class MBookingSeats 
{

    public void userDetails(String idType, String idNumber, String country, String expDate, String lastName, String firstMiddleName, String dob, String email, String phoneNo) 
    {
        Connection connection = null;
        PreparedStatement ps = null;
        PreparedStatement PSBooking = null;
        try 
        {
            // Establish database connection
            connection = DBConnection.createDBConnection();

            // Prepare the insert query
            String query = "INSERT INTO User (ID_Type, ID_Number, Expiration_Date, English_Last_Name, English_First_and_Middle_Name, Date_of_Birth, Country, Phone_no, Email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = connection.prepareStatement(query);  
            
            // Prepare the insert query
            String queryBooking = "INSERT INTO `booking`(`Booking_ID`, `Booking_Date`, `Number_of_Passengers`, `Total_Amount`, `Booking_Status`, `Schedule_ID`, `User_ID`) VALUES (?,?,?,?,?,?,?)";
            PSBooking = connection.prepareStatement(queryBooking);

            // Set query parameters
            ps.setString(1, idType);
            ps.setString(2, idNumber);
            ps.setString(3, expDate );
            ps.setString(4, lastName);
            ps.setString(5, firstMiddleName);
            ps.setString(6, dob);
            ps.setString(7, country);
            ps.setString(8, phoneNo);
            ps.setString(9, email);
            
            
            

            // Execute the query
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) 
            {
                System.out.println("User Details added successfully.");
            } 
            else 
            {
                System.err.println("User Details was not added. No rows affected.");
            }
        } 
        catch (SQLException e) 
        {
            // Log SQL exception details
            System.err.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
        } 
        catch (Exception e) 
        {
            // Handle other exceptions
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        } 
        finally 
        {
            // Close resources in reverse order of creation
            try 
            {
                if (ps != null) ps.close();
                if (connection != null) connection.close();
            } 
            catch (SQLException e) 
            {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
    }
    
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    
    public void bookingSeats(int booking_Id, String bookingDate, int No_of_Passesngers, double TotalAmount, String Booking_Status,int Schedule_ID, int USER_ID) 
    {
        Connection connection = null;
        PreparedStatement ps = null;
        try 
        {
            // Establish database connection
            connection = DBConnection.createDBConnection();

            // Prepare the insert query
            String query = "INSERT INTO `booking`(`Booking_ID`, `Booking_Date`, `Number_of_Passengers`, `Total_Amount`, `Booking_Status`, `Schedule_ID`, `User_ID`) VALUES (?,?,?,?,?,?,?)";
            ps = connection.prepareStatement(query); 
            
            //Set Booking_Date String to Date
            java.sql.Date sqlDepartureDate = new java.sql.Date(dateFormat.parse(bookingDate).getTime());
           

            // Set query parameters
            ps.setInt(1, booking_Id);
            ps.setDate(2, sqlDepartureDate);
            ps.setInt(3, No_of_Passesngers );
            ps.setDouble(4, TotalAmount);
            ps.setString(5, Booking_Status);
            ps.setInt(6, Schedule_ID);
            ps.setInt(7, USER_ID);
            
            
            

            // Execute the query
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) 
            {
                System.out.println("Booking added successfully.");
            } 
            else 
            {
                System.err.println("Booking was not added. No rows affected.");
            }
        } 
        catch (SQLException e) 
        {
            // Log SQL exception details
            System.err.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
        } 
        catch (Exception e) 
        {
            // Handle other exceptions
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        } 
        finally 
        {
            // Close resources in reverse order of creation
            try 
            {
                if (ps != null) ps.close();
                if (connection != null) connection.close();
            } 
            catch (SQLException e) 
            {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}
