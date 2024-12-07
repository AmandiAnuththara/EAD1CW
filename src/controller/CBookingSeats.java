package controller;
import model.MBookingSeats;
public class CBookingSeats 
{
    int User_ID = 0;
    public int userDetails(String idType, String idNumber, String country, String expDate, String lastName, String firstMiddleName, String dob, String email, String phoneNo,int Schedule_ID) {
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
            User_ID = mBookingSeats.userDetails(idType, idNumber, country, expDate, lastName, firstMiddleName, dob, email, phoneNo,Schedule_ID);

            
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
        return User_ID;
    }
    public void bookingSeats( String bookingDate, int noOfPassengers, int scheduleId, int userId) {
        try 
        {
            // Validate inputs
            if (bookingDate == null || bookingDate.isEmpty() ) 
            {
                throw new IllegalArgumentException("All fields must be filled out!");
            }

            if (noOfPassengers <= 0) 
            {
                throw new IllegalArgumentException("Number of passengers must be greater than 0.");
            }

            

            // Delegate to the model
            MBookingSeats mBookingSeats = new MBookingSeats();
            mBookingSeats.bookingSeats( bookingDate, noOfPassengers, scheduleId, userId);

            
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
    
    public Object[] getTrainDetails(int scheduleId) {
        MBookingSeats mBookingSeats = new MBookingSeats();
        return mBookingSeats.getTrainDetailsByScheduleId(scheduleId);
    }

}