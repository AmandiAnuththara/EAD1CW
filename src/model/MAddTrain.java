package model;
import java.sql.*;
public class MAddTrain 
{
    public void addTrainSchedule(int trainNo, int noOfSeatsInTrain, Date departureDate, String departureTime, String departureStation, String arrivalTime, String arrivalStation, String travelTime, double travelCost) 
    {
        try 
        {
            // Establish database connection
            Statement st = DBConnection.createDBConnection().createStatement();

            // Insert query
            String query = "INSERT INTO Train (Train_No, No_of_Seats_in_Train, Departure_Date, Departure_Time, " +
                       "Departure_Station, Arrival_Time, Arrival_Station, Travel_Time, Travel_Cost) " +
                       "VALUES ('" + trainNo + "', '" + noOfSeatsInTrain + "', '" + departureDate + "', '" + 
                       departureTime + "', '" + departureStation + "', '" + arrivalTime + "', '" + arrivalStation + 
                       "', '" + travelTime + "', '" + travelCost + "')";
        
               // Execute the query
            st.executeUpdate(query);
            System.out.println("Train schedule successfully added.");
        } 
        catch (SQLException e) 
        {
            // Handle SQL exceptions
            System.err.println("Error: " + e.getMessage());
        }
    }
}
