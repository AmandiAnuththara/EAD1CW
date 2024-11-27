package controller;

import model.MSelectTrain;
import java.sql.Date;
import java.util.List;

public class CSelectTrain {
    private final MSelectTrain model;

    public CSelectTrain() {
        this.model = new MSelectTrain(); // Initialize the model
    }

    /**
     * Retrieves train details from the model based on user inputs.
     *
     * @param from Starting station.
     * @param to Ending station.
     * @param departureDate Departure date.
     * @return List of train details as Object arrays.
     */
    public List<Object[]> getTrainDetails(String from,String to, String departureDate) {
        return model.getTrainDetails(from,to,departureDate);
    }
}
