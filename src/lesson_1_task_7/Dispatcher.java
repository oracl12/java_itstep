package lesson_1_task_7;

import lesson_1_task_7.controllers.LineController;
import lesson_1_task_7.controllers.RectangleController;
import lesson_1_task_7.models.Line;
import lesson_1_task_7.models.Rectangle;
import lesson_1_task_7.models.Triangle;
import lesson_1_task_7.controllers.TriangleController;

public class Dispatcher {
    public static void main(String[] args) {
        // TODO when shape dont equal error

        Triangle triangle = new Triangle(5);
        Rectangle rec = new Rectangle(5);

        Triangle triangle2 = new Triangle(6);
        Rectangle rec2 = new Rectangle(6);

        Triangle triangle3 = new Triangle(3);
        Rectangle rec3 = new Rectangle(4);
        Line line = new Line(10);
        View view = new View();

        view.simpleRender(0, TriangleController.bottomLeftTriangle(triangle));
        view.simpleRender(5, TriangleController.topLeftTriangle(triangle));
        view.simpleRender(0, TriangleController.topRightTriangle(triangle));
        view.simpleRender(0, TriangleController.bottomRightTriangle(triangle));
        view.simpleRender(0, RectangleController.cube(rec));
        view.simpleRender(0, LineController.line(line, "."));
        view.simpleRender(0, LineController.line(line, " "));

        view.inlineRender(5, TriangleController.bottomRightTriangle(triangle), TriangleController.bottomLeftTriangle(triangle));
        view.inlineRender(2, TriangleController.bottomRightTriangle(triangle), RectangleController.cube(rec), TriangleController.bottomLeftTriangle(triangle));
        view.inlineRender(1, TriangleController.bottomRightTriangle(triangle2), RectangleController.cube(rec2), TriangleController.bottomLeftTriangle(triangle2));
        view.inlineRender(7, TriangleController.bottomRightTriangle(triangle3), TriangleController.bottomLeftTriangle(triangle3));
        view.simpleRender(8, RectangleController.cube(rec3));

        view.verticalRender(TriangleController.bottomLeftTriangle(triangle), TriangleController.topLeftTriangle(triangle));
        view.verticalRender(TriangleController.bottomLeftTriangle(triangle), RectangleController.cube(rec), TriangleController.topLeftTriangle(triangle));
        view.verticalRender(TriangleController.bottomLeftTriangle(triangle), RectangleController.cube(rec), TriangleController.topRightTriangle(triangle));


    }
}
