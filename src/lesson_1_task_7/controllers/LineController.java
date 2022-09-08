package lesson_1_task_7.controllers;

import lesson_1_task_7.models.Line;

public class LineController {
    public static String line(Line line, String charecter){
        String result = "";
        for (int i = 0; i < line.len; i++){
            result += charecter;
        }
        return result;
    }
}
