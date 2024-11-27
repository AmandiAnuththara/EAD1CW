package controller;
import java.util.Date;
import model.MBookingSeats;
public class CBookingSeats 
{
    public void bookingSeats(String idType, String idNumber, String country, String expDate, String lastName, String firstMiddleName, String dob, String email, String phoneNo) {
        try 
        {
            // Validate inputs
            if (idType == null || idType.isEmpty() ||
                idNumber == null || idNumber.isEmpty() ||
                country == null || country.isEmpty() ||
                lastName == null || lastName.isEmpty() ||
                firstMiddleName == null || firstMiddleName.isEmpty() ||
                email == null || email.isEmpty() ||
                phoneNo == null || phoneNo.isEmpty()) 
            {
                throw new IllegalArgumentException("All fields must be filled out!");
            }

            if (!email.contains("@")) 
            {
                throw new IllegalArgumentException("Invalid email format.");
            }

            if (!phoneNo.matches("\\d+")) 
            {
                throw new IllegalArgumentException("Phone number must contain only digits.");
            }

            // Delegate to the model
            MBookingSeats mBookingSeats = new MBookingSeats();
            mBookingSeats.bookingSeats(idType, idNumber, country, expDate, lastName, firstMiddleName, dob, email, phoneNo);

            // Log Success
            System.out.println("Seat booking successful for ID number: " + idNumber);
        } 
        catch (IllegalArgumentException ex) 
        {
            // Handle Validation Errors
            System.err.println("Validation Errors: " + ex.getMessage());
        } 
        catch (Exception e) 
        {
            // Handle General Errors
            System.err.println("Error while booking seats: " + e.getMessage());
        }
    }
}
