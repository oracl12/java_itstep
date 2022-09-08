package lesson_1_task_7.controllers;

import lesson_1_task_7.models.Triangle;

public class TriangleController {
    public static String bottomLeftTriangle(Triangle figure) {
        String result = "";
        for (int i = 0; i <= figure.x; i++) {
            for (int j = 0; j < i; j++) {
                result += '.';
            }
            result += "\n";
        }
        return result;
    }

    public static String topLeftTriangle(Triangle figure) {
        String result = "";
        for (int i = 1; i <= figure.x; i++) {
            for (int j = figure.x; j >= 1; j--) {
                if (j >= i) {
                    result += '.';
                }
            }
            result += "\n";
        }
        return result;
    }


    public static String topRightTriangle(Triangle figure) {
        String result = "";
        for (int i = figure.x; i  > 0; i--){
            for (int j = figure.x - i; j > 0; j--){
                result += ' ';
            }
            for (int j = i; 0 < j; j--){
                result += '.';
            }
            result += "\n";
        }
        return result;
    };

    public static String bottomRightTriangle(Triangle figure) {
        String result = "";
        for (int i = 1; i < figure.x + 1; i++){
            for (int j = figure.x - i; j > 0; j--){
                result += ' ';
            }
            for (int j = i; 0 < j; j--){
                result += '.';
            }
            result += "\n";
        }
        return result;
    };
}
