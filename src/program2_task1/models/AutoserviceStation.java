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

    public static void repair(Car car, AutoserviceStation autoserviceStation){
        if (autoserviceStation.currentCars.contains(car)){
            autoserviceStation.currentCars.remove(car);
            System.out.println("Successful repair.");
        }else{
            System.out.println("Dont have such car on station.");
        }
    }
}
