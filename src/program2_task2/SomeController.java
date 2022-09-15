package program2_task2;

import static java.lang.Math.*;

public class SomeController {
    public static double firstMethod(String function, double firstOperand, double secondOperand) {
        return switch (function) {
            case ("div") -> firstOperand / secondOperand;
            case ("log10") -> log10(firstOperand + secondOperand);
            case ("log") -> log(firstOperand + secondOperand);
            case ("pow") -> pow(firstOperand, secondOperand);
            default -> firstOperand;
        };
    }

    public static double secondMethod(String field, Car car, double operand) {
        return switch (field) {
            case ("price") -> car.price * operand;
            case ("weight") -> car.weight * operand;
            case ("speed") -> car.speed * operand;
            default -> car.price;
        };
    }
}
