package model;
import java.util.Date;
public class train_bookings 
{
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String trainNo;
    private Date departureDate;
    private String departureStation;
    private String arrivalStation;
    private double travelCost;

    // Getters and Setters
    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public String getTrainNo() 
    {
        return trainNo;
    }

    public void setTrainNo(String trainNo) 
    {
        this.trainNo = trainNo;
    }

    public Date getDepartureDate() 
    {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) 
    {
        this.departureDate = departureDate;
    }

    public String getDepartureStation() 
    {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) 
    {
        this.departureStation = departureStation;
    }

    public String getArrivalStation() 
    {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) 
    {
        this.arrivalStation = arrivalStation;
    }

    public double getTravelCost() 
    {
        return travelCost;
    }

    public void setTravelCost(double travelCost) 
    {
        this.travelCost = travelCost;
    }

    @Override
    public String toString() 
    {
        return "TrainBooking{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", trainNo='" + trainNo + '\'' +
                ", departureDate=" + departureDate +
                ", departureStation='" + departureStation + '\'' +
                ", arrivalStation='" + arrivalStation + '\'' +
                ", travelCost=" + travelCost +
                '}';
    }
}