package controller;
import model.*;
public class CAddTrain 
{
    public void addTrainSchedule(int trainNo, int noOfSeatsInTrain, String departureDate, String departureTime, String departureStation, String arrivalTime, String arrivalStation, String travelTime, double travelCost) 
    {
        try
        {
            // Validate inputs 
            if (trainNo <= 0 || noOfSeatsInTrain <= 0 || travelCost < 0) 
            {
                throw new IllegalArgumentException("Invalid numeric inputs: train number, seats, or cost.");
            }
            if (departureDate == null || departureTime.isEmpty() || departureStation.isEmpty() || arrivalStation.isEmpty()) 
            {
                throw new IllegalArgumentException("Invalid or missing date/time/station inputs.");
            }

            // Delegate to the model
            MAddTrain mtrain = new MAddTrain();
            mtrain.addTrainSchedule(trainNo, noOfSeatsInTrain, departureDate, departureTime, departureStation, arrivalTime, arrivalStation, travelTime, travelCost);

            // Log success
            System.out.println("Train schedule successfully added! Train No: " + trainNo);
        }
        catch (IllegalArgumentException ex) 
        {
            // Log input validation errors
            System.err.println("Validation Error: " + ex.getMessage());
        }
        catch(Exception e)
        {
            System.err.println("Error while adding train schedule: " + e.getMessage());
        } 
    } 
}
