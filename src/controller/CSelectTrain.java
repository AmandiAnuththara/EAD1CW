package controller;
import model.MSelectTrain;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class CSelectTrain 
{
    private final MSelectTrain model;

    public CSelectTrain() 
    {
        this.model = new MSelectTrain(); // Initialize the model
    }

    public List<Object[]> getTrainDetails(String from,String to, String departureDate) 
    {
        try 
        {
            return model.getTrainDetails(from,to,departureDate);
        } 
        catch (ParseException ex) 
        {
            Logger.getLogger(CSelectTrain.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
