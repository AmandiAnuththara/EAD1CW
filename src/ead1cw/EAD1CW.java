package ead1cw;
import controller.*;
import model.*;
import view.*;
public class EAD1CW 
{
    public static void main(String[] args) 
    {
      VAddTrain vaddTrain = new VAddTrain();
      MAddTrain maddTrain = new MAddTrain();
      CAddTrain caddTrain = new CAddTrain();
      
      VBookingSeats vbookingSeats = new VBookingSeats(0,"");
      MBookingSeats mbokingSeats = new MBookingSeats();
      CBookingSeats cbookingSeats = new CBookingSeats();
      
      VSelectTrain vselectTrain =new VSelectTrain();
      MSelectTrain mselectTrain = new MSelectTrain();
      CSelectTrain cselectTrain = new CSelectTrain();
    }
}
