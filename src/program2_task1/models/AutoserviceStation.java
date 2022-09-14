package program2_task1.models;

import java.util.ArrayList;

public class AutoserviceStation {
    public String naming;
    public int maxCarsAtOnce;
    public ArrayList<Car> currentCars;

    public AutoserviceStation(String namingValue, int maxCarsAtOnceValue){
        naming =  namingValue;
        maxCarsAtOnce = maxCarsAtOnceValue;
        currentCars = new ArrayList<>();
    }
}
