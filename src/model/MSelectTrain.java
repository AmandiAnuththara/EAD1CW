package model;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
public class MSelectTrain 
{
    // Method to retrieve train details from the database
    public List<Object[]> getTrainDetails(String from,String to, String departureDate) throws ParseException 
    {
        List<Object[]> trainDetails = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        // Convert the departureDate string to a java.sql.Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try 
        {
            // Connect to the database
            connection = DBConnection.createDBConnection();

            java.sql.Date sqlDepartureDate = new java.sql.Date(dateFormat.parse(departureDate).getTime());

            // Updated SQL query
            String query = "Select * from train WHERE `Departure_Station` = ? AND `Arrival_Station` = ? AND `Departure_Date` = ?;";
            ps = connection.prepareStatement(query);
            ps.setString(1, from);
            ps.setString(2, to);
            ps.setDate(3, sqlDepartureDate);

            rs = ps.executeQuery();

            // Add the results to the list
            while (rs.next()) 
            {
                Object[] train = 
                {
                    rs.getInt("Train_No"),               // Train number
                    rs.getString("Travel_Time"),        // Travel time
                    rs.getDate("Departure_Date"),       // Departure date
                    rs.getTime("Departure_Time"),       // Departure time
                    rs.getTime("Arrival_Time"),         // Arrival time
                    rs.getDouble("Travel_Cost"),        // Travel cost
                    };
                    trainDetails.add(train);
                }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            try 
            {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (connection != null) connection.close();
            } 
            catch (SQLException e) 
            {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
        return trainDetails;
    }
}
