package lesson_1_task_7.controllers;

import lesson_1_task_7.models.Line;

public class LineController {
    public static String line(Line line) {
        StringBuilder result = new StringBuilder();
        result.append(" ".repeat(Math.max(0, line.shift)));
        result.append(String.valueOf(line.symbol).repeat(Math.max(0, line.len)));

        return result.toString();
    }
}
