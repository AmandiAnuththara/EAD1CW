package controller;
import model.MBookingSeats;
public class CBookingSeats 
{
    public void userDetails(String idType, String idNumber, String country, String expDate, String lastName, String firstMiddleName, String dob, String email, String phoneNo) {
        try 
        {
            // Validate inputs
            if (idType == null || idType.isEmpty() ||
                idNumber == null || idNumber.isEmpty() ||
                country == null || country.isEmpty() ||
                lastName == null || lastName.isEmpty() ||
                firstMiddleName == null || firstMiddleName.isEmpty() ||
                email == null || email.isEmpty() ||
                phoneNo == null || phoneNo.isEmpty()) {
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
            mBookingSeats.userDetails(idType, idNumber, country, expDate, lastName, firstMiddleName, dob, email, phoneNo);

            // Log success
            System.out.println("User details added successfully for ID number: " + idNumber);
        } 
        catch (IllegalArgumentException ex) 
        {
            // Handle validation errors
            System.err.println("Validation Error: " + ex.getMessage());
        } 
        catch (Exception e) 
        {
            // Handle general errors
            System.err.println("Error while saving user details: " + e.getMessage());
        }
    }
    public void bookingSeats(int bookingId, String bookingDate, int noOfPassengers, double totalAmount, String bookingStatus, int scheduleId, int userId) {
        try 
        {
            // Validate inputs
            if (bookingDate == null || bookingDate.isEmpty() || bookingStatus == null || bookingStatus.isEmpty()) 
            {
                throw new IllegalArgumentException("All fields must be filled out!");
            }

            if (noOfPassengers <= 0) 
            {
                throw new IllegalArgumentException("Number of passengers must be greater than 0.");
            }

            if (totalAmount <= 0) 
            {
                throw new IllegalArgumentException("Total amount must be greater than 0.");
            }

            // Delegate to the model
            MBookingSeats mBookingSeats = new MBookingSeats();
            mBookingSeats.bookingSeats(bookingId, bookingDate, noOfPassengers, totalAmount, bookingStatus, scheduleId, userId);

            // Log success
            System.out.println("Seat booking successful for Booking ID: " + bookingId);
        } 
        catch (IllegalArgumentException ex) 
        {
            // Handle validation errors
            System.err.println("Validation Error: " + ex.getMessage());
        } 
        catch (Exception e) 
        {
            // Handle general errors
            System.err.println("Error while booking seats: " + e.getMessage());
        }
    }
}