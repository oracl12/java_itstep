package program2_task2;

public class Main {
    public static void main(String[] args) {
        // first method
        System.out.println(MathController.firstMethod("pow", 5, 1));
        System.out.println(MathController.firstMethod("log10", 5, 5));
        System.out.println(MathController.firstMethod("log", 3, 1.2));
        System.out.println(MathController.firstMethod("div", 10, 5));

        Car car = new Car(100, 100, 150);
        System.out.println(car.price);
        car.price = MathController.secondMethod("price", car, 5);
        System.out.println(car.price);
    }
}
