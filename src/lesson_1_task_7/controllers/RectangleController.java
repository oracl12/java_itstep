package lesson_1_task_7.controllers;

import lesson_1_task_7.models.Rectangle;

public class RectangleController {
    public static String cube(Rectangle figure) {
        String result = "";
        for (int i = 0; i < figure.x; i++) {
            for (int j = 0; j < figure.x; j++) {
                result += '.';
            }
            result += "\n";
        }
        return result;
    }
}
