package program2_task1.controllers;

import program2_task1.models.Car;

public class CarController {
    public static int getCarCount(){
        return Car.carCount;
    }

    public static void brokeCar(Car car){
        car.isWorking = false;
    }
}
