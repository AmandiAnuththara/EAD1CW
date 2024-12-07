package model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.train_bookings;
public class Database 
{
    // Example of a database connection setup (adjust as needed for your database)
    private static final String DB_URL = "jdbc:mysql://localhost:3306/train";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    // Generic method to execute a query and map results to a list of objects
    public static <T> List<T> executeQuery(String query, Class<T> type) 
    {
        List<T> results = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) 
        {

            while (resultSet.next()) 
            {
                if (type == train_bookings.class) 
                {
                    train_bookings booking = new train_bookings();
                    booking.setId(resultSet.getInt("id"));
                    booking.setFirstName(resultSet.getString("first_name"));
                    booking.setLastName(resultSet.getString("last_name"));
                    booking.setPhoneNumber(resultSet.getString("phone_number"));
                    booking.setTrainNo(resultSet.getString("train_no"));
                    booking.setDepartureDate(resultSet.getDate("departure_date"));
                    booking.setDepartureStation(resultSet.getString("departure_station"));
                    booking.setArrivalStation(resultSet.getString("arrival_station"));
                    booking.setTravelCost(resultSet.getDouble("travel_cost"));
                    results.add(type.cast(booking));
                }
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return results;
    }
}