package program2_task1.models;

import java.util.ArrayList;
import java.util.stream.Collectors;

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

    public static ArrayList<Car> getAllCarForDriver(Driver driver){
        return driver.cars;
    }

    public static ArrayList<Car> getAllCarWorkingForDriver(Driver driver){
        return (ArrayList<Car>) driver.cars.stream().filter(x -> x.isWorking).collect(Collectors.toList());
    }

    public static void repairCarByMySelf(Driver driver, Car car){
        if (car.getDriver() != driver){
            System.out.println("Thats not ours car. \nCannot repair");
        }else{
            car.isWorking = true;
            System.out.println("Successfully repaired");
        }
    }

    public static void putCarToAutoService(Driver driver, Car car, AutoserviceStation autoServiceStation){
        if (car.getDriver() != driver){
            System.out.println("Thats not ours car. \nCannot put to autoservice");
        }else if (car.isWorking){
            System.out.println("Thats car is working. We accept only unworking.");
        }else if (autoServiceStation.currentCars.size() >= autoServiceStation.maxCarsAtOnce){
            System.out.println("Dont have space to this car");
        }else if (autoServiceStation.currentCars.contains(car)){
            System.out.println("We already have such car.");
        }else {
            autoServiceStation.currentCars.add(car);
            System.out.println("Success in putting car to service");
        }
    }
}
