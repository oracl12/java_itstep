package program2_task1;

import program2_task1.views.View;
import program2_task1.controllers.CarController;
import program2_task1.models.AutoserviceStation;
import program2_task1.models.Car;
import program2_task1.models.Driver;

public class Main {
    public static void main(String[] args) {
        AutoserviceStation station1 = new AutoserviceStation("Somename", 3);
        AutoserviceStation station2 = new AutoserviceStation("Somename2", 5);
        Driver driver1 = new Driver("Ostap");
        Driver driver2 = new Driver("Oleg");
        Car car1 = new Car("bentley", driver1);
        Car car2 = new Car("mustang", driver1);
        Car car3 = new Car("mustang", driver2);

        CarController.brokeCar(car1);
        Driver.putCarToAutoService(driver1, car1, station1);
        Driver.putCarToAutoService(driver1, car1, station1);
        AutoserviceStation.repair(car1, station2);
        View.statisticCarForDriver(Driver.getAllCarWorkingForDriver(driver1));
        Driver.repairCarByMySelf(driver1, car1);
        View.statisticCarForDriver(Driver.getAllCarWorkingForDriver(driver1));

        View.statisticCarCount(Car.getCarCount());
        View.statisticCarForDriver(Driver.getAllCarForDriver(driver1));

    }
}
