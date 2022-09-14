package lesson_1_task_7.controllers;

import lesson_1_task_7.models.Triangle;

public class TriangleController {
    static String result;

    public static String bottomLeftTriangle(Triangle figure) {
        result = "";
        for (int i = 1; i <= figure.x; i++) {
            result += shiftDealer(figure.shift);
            for (int j = 0; j < i; j++) {
                result += figure.symbol;
            }
            result += "\n";
        }
        return result;
    }

    public static String topLeftTriangle(Triangle figure) {
        result = "";
        for (int i = 1; i <= figure.x; i++) {
            result += shiftDealer(figure.shift);
            for (int j = figure.x; j >= 1; j--) {
                if (j >= i) {
                    result += figure.symbol;
                }
            }
            result += "\n";
        }
        return result;
    }

    public static String topRightTriangle(Triangle figure) {
        result = "";
        for (int i = figure.x; i  > 0; i--){
            result += shiftDealer(figure.shift);
            result += spaceDealer(figure.x, i);
            for (int j = i; 0 < j; j--){
                result += figure.symbol;
            }
            result += "\n";
        }
        return result;
    }

    public static String bottomRightTriangle(Triangle figure) {
        result = "";
        for (int i = 1; i < figure.x + 1; i++){
            result += shiftDealer(figure.shift);
            result += spaceDealer(figure.x, i);
            for (int j = i; 0 < j; j--){
                result += figure.symbol;
            }
            result += "\n";
        }
        return result;
    }

    private static String shiftDealer(int shift){
        return " ".repeat(Math.max(0, shift));
    }

    private static String spaceDealer(int x, int i){
        return " ".repeat(Math.max(0, x - i));
    }
}
