package program2_task1;

import program2_task1.controllers.AutoServiceStationController;
import program2_task1.controllers.CarController;
import program2_task1.controllers.DriverController;
import program2_task1.models.AutoserviceStation;
import program2_task1.models.Car;
import program2_task1.models.Driver;

public class Main {
    public static void main(String[] args) {
        AutoserviceStation station1 = new AutoserviceStation("Somename", 3);
        Driver driver1 = new Driver("Ostap");
        Driver driver2 = new Driver("Oleg");
        Car car1 = new Car("bentley", driver1);
        Car car2 = new Car("mustang", driver1);
        Car car3 = new Car("mustang", driver2);

//        System.out.println(CarController.getCarCount());
//        System.out.println(DriverController.getAllCarForDriver(driver1));

//        CarController.brokeCar(car1);
//        DriverController.putCarToAutoService(driver1, car1, station1);
//        DriverController.putCarToAutoService(driver1, car1, station1);
//        AutoServiceStationController.repair(car1, station1);
//        System.out.println(DriverController.getAllCarWorkingForDriver(driver1));
//        DriverController.repairCarByMySelf(driver1, car1);
//        System.out.println(DriverController.getAllCarWorkingForDriver(driver1));


    }
}
