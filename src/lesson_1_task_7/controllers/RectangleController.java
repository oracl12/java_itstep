package lesson_1_task_7.controllers;

import lesson_1_task_7.models.Rectangle;

public class RectangleController {
    public static String rectangle(Rectangle rectangle) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < rectangle.height; i++) {
            result.append(" ".repeat(Math.max(0, rectangle.shift)));
            result.append(String.valueOf(rectangle.symbol).repeat(Math.max(0, rectangle.width)));
            result.append("\n");
        }
        return result.toString();
    }
}
