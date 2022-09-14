package program2_task1.models;

import java.util.ArrayList;

public class Driver {
    public ArrayList<Car> cars;
    String driverName;

    public Driver(String driverNameValue){
        driverName = driverNameValue;
        cars = new ArrayList<>();
    }

    public String getDriverName(){
        return driverName;
    }
}
