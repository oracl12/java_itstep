package lesson_1_task_7;

import lesson_1_task_7.controllers.RectangleController;
import lesson_1_task_7.models.Rectangle;
import lesson_1_task_7.models.Triangle;
import lesson_1_task_7.controllers.TriangleController;

public class Dispatcher {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5);
        Rectangle rec = new Rectangle(5);
        View view = new View();

        view.simple_render(TriangleController.bottomLeftTriangle(triangle));
        view.simple_render(TriangleController.topLeftTriangle(triangle));
        view.simple_render(TriangleController.topRightTriangle(triangle));
        view.simple_render(TriangleController.bottomRightTriangle(triangle));
        view.simple_render(RectangleController.cube(rec));

        view.inline_render(TriangleController.bottomRightTriangle(triangle), TriangleController.bottomLeftTriangle(triangle));
    }
}
