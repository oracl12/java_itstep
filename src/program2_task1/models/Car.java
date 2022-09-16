package program2_task1.models;

public class Car {
    public static int carCount;
    String brand;
    Driver driver;
    public Boolean isWorking;

    public Car(String brandValue, Driver driverValue){
        brand = brandValue;
        driver = driverValue;
        isWorking = true;
        carCount+=1;
        driver.cars.add(this);
    }

    public Driver getDriver(){
        return driver;
    }
    public String getBrand(){
        return brand;
    }
    public static int getCarCount(){
        return Car.carCount;
    }
}
