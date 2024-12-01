package model;
import java.util.*;
public class MViewReport 
{
    // Method to fetch train booking user details
    public List<TrainBooking> getBookingDetails() 
    {
        // Replace this with actual database query logic
        String query = "SELECT id, first_name, last_name, phone_number, train_no, departure_date, " +
                       "departure_station, arrival_station, travel_cost FROM train_bookings";
        return Database.executeQuery(query, TrainBooking.class); // Assume Database helper exists
    }
}
