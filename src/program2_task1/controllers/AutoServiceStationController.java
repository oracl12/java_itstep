package program2_task1.controllers;

import program2_task1.models.AutoserviceStation;
import program2_task1.models.Car;

public class AutoServiceStationController {
    public static void repair(Car car, AutoserviceStation autoserviceStation){
        if (autoserviceStation.currentCars.contains(car)){
            autoserviceStation.currentCars.remove(car);
            System.out.println("Successful repair.");
        }else{
            System.out.println("Dont have such car on station.");
        }
    }
}