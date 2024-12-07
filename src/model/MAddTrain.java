package model;
import java.sql.*;

public class MAddTrain 
{
    public void addTrainSchedule(int trainNo, int noOfSeatsInTrain, String departureDate, String departureTime, String departureStation, String arrivalTime, String arrivalStation, String travelTime, double travelCost) 
    {
        try 
        {
            // Establish database connection
            Statement st = DBConnection.createDBConnection().createStatement();

            // Insert query for Train table
            String trainQuery = "INSERT INTO Train (Train_No, No_of_Seats_in_Train, Departure_Date, Departure_Time, Departure_Station, Arrival_Time, Arrival_Station, Travel_Time, Travel_Cost) " +
                                "VALUES ('" + trainNo + "', '" + noOfSeatsInTrain + "', '" + departureDate + "', '" + departureTime + "', '" + departureStation + "', '" + arrivalTime + "', '" + arrivalStation + "', '" + travelTime + "', '" + travelCost + "')";
            
            // Execute the query for Train table
            st.executeUpdate(trainQuery);

            // Insert query for schedule table with Total_Booked_Seats as 0
            String scheduleQuery = "INSERT INTO schedule (Train_No, Total_Booked_Seats, Scheduled_Date) " +
                                   "VALUES ('" + trainNo + "', 0, '" + departureDate + "')";
            
            // Execute the query for schedule table
            st.executeUpdate(scheduleQuery);

            System.out.println("Train schedule and associated data successfully added.");
        } 
        catch (SQLException e) 
        {
            // Handle SQL exceptions
            System.err.println("Error: " + e.getMessage());
        }
    }
}
