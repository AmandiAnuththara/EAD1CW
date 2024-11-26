package model;
import java.sql.*;
import java.util.Date;
public class MBookingSeats 
{

    public void bookingSeats(String idType, String idNumber, String country, Date expDate, String lastName, String firstMiddleName, Date dob, String email, String phoneNo) 
    {
        Connection connection = null;
        PreparedStatement ps = null;
        try 
        {
            // Establish database connection
            connection = DBConnection.createDBConnection();

            // Prepare the insert query
            String query = "INSERT INTO User (ID_Type, ID_Number, Expiration_Date, English_Last_Name, English_First_and_Middle_Name, Date_of_Birth, Country, Phone_no, Email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = connection.prepareStatement(query);

            // Set query parameters
            ps.setString(1, idType);
            ps.setString(2, idNumber);
            ps.setDate(3, expDate != null ? new java.sql.Date(expDate.getTime()) : null);
            ps.setString(4, lastName);
            ps.setString(5, firstMiddleName);
            ps.setDate(6, dob != null ? new java.sql.Date(dob.getTime()) : null);
            ps.setString(7, country);
            ps.setString(8, phoneNo);
            ps.setString(9, email);

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
