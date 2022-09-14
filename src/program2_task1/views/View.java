package program2_task1.views;

import program2_task1.models.Car;

import java.util.ArrayList;

public class View {
    public static void statisticCarForDriver(ArrayList<Car> cars){
        System.out.println("-".repeat(30)+"\nCARS STATISTIC");
        for(int i = 0; i < cars.size(); i++) {
            System.out.println("Car " + i );
            System.out.printf("Brand: %s%n", cars.get(i).getBrand());
            System.out.printf("Driver: %s%n", cars.get(i).getDriver().getDriverName());
            System.out.printf("Working status: %s%n", cars.get(i).isWorking ? "working" : "broken");
        }
        System.out.println("-".repeat(30));
    }

    public static void statisticCarCount(int count){
        System.out.println("-".repeat(30));
        System.out.println("Count of cars: " + count);
        System.out.println("-".repeat(30));
    }
}
