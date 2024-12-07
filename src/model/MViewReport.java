package model;
import java.util.*;
import model.train_bookings;


public class MViewReport 
{
    // Method to fetch train booking user details
    public List<train_bookings> getBookingDetails() 
    {
        // Replace this with actual database query logic
        String query = "SELECT \n" +
                        "    u.User_ID,\n" +
                        "    u.ID_Type,\n" +
                        "    u.ID_Number,\n" +
                        "    u.Expiration_Date,\n" +
                        "    u.English_Last_Name,\n" +
                        "    u.English_First_and_Middle_Name,\n" +
                        "    u.Date_of_Birth,\n" +
                        "    u.Country,\n" +
                        "    u.Phone_no,\n" +
                        "    u.Email,\n" +
                        "    b.Booking_ID,\n" +
                        "    b.Booking_Date,\n" +
                        "    b.Number_of_Passengers,\n" +
                        "    b.Total_Amount,\n" +
                        "    b.Booking_Status,\n" +
                        "    t.Train_No,\n" +
                        "    t.Departure_Date,\n" +
                        "    t.Departure_Time,\n" +
                        "    t.Departure_Station,\n" +
                        "    t.Arrival_Station,\n" +
                        "    t.Arrival_Time,\n" +
                        "    t.Travel_Time,\n" +
                        "    t.Travel_Cost,\n" +
                        "    t.No_of_Seats_in_Train\n" +
                        "FROM \n" +
                        "    booking b\n" +
                        "JOIN \n" +
                        "    user u ON b.User_ID = u.User_ID\n" +
                        "JOIN \n" +
                        "    train t ON b.Train_No = t.Train_No\n" +
                        "WHERE \n" +
                        "    1;";
        return Database.executeQuery(query, train_bookings.class); // Assume Database helper exists
    }
}
