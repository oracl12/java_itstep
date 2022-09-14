package lesson_1_task_7;

import lesson_1_task_7.controllers.LineController;
import lesson_1_task_7.controllers.RectangleController;
import lesson_1_task_7.models.Line;
import lesson_1_task_7.models.Rectangle;
import lesson_1_task_7.models.Triangle;
import lesson_1_task_7.controllers.TriangleController;

public class Dispatcher {
    public static void main(String[] args) {
        //Basic models

        Rectangle rec1 = new Rectangle(5,10, '+', 0);
        Rectangle rec2 = new Rectangle(5,10, '-', 10);

        Triangle triangle1 = new Triangle(5, '0', 10);
        Triangle triangle2 = new Triangle(5, '-', 0);

        Line line = new Line(10, '*', 10);

        // Views with controllers
        View view = new View();

        // Level 1
        System.out.println("LEVEL1 ".repeat(10));
        view.simpleRender(LineController.line(line));
        view.simpleRender(RectangleController.rectangle(rec1));
        view.simpleRender(TriangleController.bottomLeftTriangle(triangle1));
        view.simpleRender(TriangleController.topLeftTriangle(triangle2));
        view.simpleRender(TriangleController.topRightTriangle(triangle1));
        view.simpleRender(TriangleController.bottomRightTriangle(triangle2));

        // Level 2
        // p1
        System.out.println("LEVEL2 p1 ".repeat(10));
        view.inlineRender(TriangleController.bottomRightTriangle(triangle1), TriangleController.bottomLeftTriangle(triangle2));
        view.inlineRender(TriangleController.bottomRightTriangle(triangle1), RectangleController.rectangle(rec1),
                TriangleController.bottomLeftTriangle(triangle2));

        // p2
        System.out.println("LEVEL2 p2 ".repeat(10));
        Rectangle rect = new Rectangle(3,5, '+', 10);

        Triangle tr1 = new Triangle(5, '0', 10);
        Triangle tr2 = new Triangle(5, '-', 10);

        view.simpleRender(TriangleController.bottomLeftTriangle(tr1));
        view.simpleRender(TriangleController.topLeftTriangle(tr2));

        view.simpleRender(TriangleController.bottomRightTriangle(tr1));
        view.simpleRender(RectangleController.rectangle(rect));
        view.simpleRender(TriangleController.topRightTriangle(tr2));

        //Tree
        System.out.println("TREE ".repeat(10));
        Triangle triangleTreeTopLeft = new Triangle(5, '0', 15);
        Triangle triangleTreeTopRight = new Triangle(5, '0', 0);
        Triangle triangleTreeMiddleLeft = new Triangle(10, '-', 10);
        Triangle triangleTreeMiddleRight = new Triangle(10, '-', 0);
        Triangle triangleTreeBottomLeft = new Triangle(15, '*', 5);
        Triangle triangleTreeBottomRight = new Triangle(15, '*', 0);
        Rectangle rectBottom = new Rectangle(3,5, '+', 17);

        view.inlineRender(TriangleController.bottomRightTriangle(triangleTreeTopLeft), TriangleController.bottomLeftTriangle(triangleTreeTopRight));
        view.inlineRender(TriangleController.bottomRightTriangle(triangleTreeMiddleLeft), TriangleController.bottomLeftTriangle(triangleTreeMiddleRight));
        view.inlineRender(TriangleController.bottomRightTriangle(triangleTreeBottomLeft), TriangleController.bottomLeftTriangle(triangleTreeBottomRight));
        view.simpleRender(RectangleController.rectangle(rectBottom));

        //rocket
        System.out.println("ROCKET ".repeat(15));
        Triangle triangleRocketTopLeft = new Triangle(5, '0', 15);
        Triangle triangleRocketTopRight = new Triangle(5, '0', 0);
        Triangle triangleRocketWingTopLeft = new Triangle(3, '0', 12);
        Triangle triangleRocketWingTopRight = new Triangle(3, '0', 0);
        Triangle triangleRocketWingBottomLeft = new Triangle(10, '0', 5);
        Triangle triangleRocketWingBottomRIght = new Triangle(10, '0', 0);
        Rectangle rectRocket1 = new Rectangle(3,10, '+', 15);
        Rectangle rectRocket2 = new Rectangle(3,10, '+', 0);
        Rectangle rectRocketBottom = new Rectangle(10,10, '+', 0);

        view.inlineRender(TriangleController.bottomRightTriangle(triangleRocketTopLeft), TriangleController.bottomLeftTriangle(triangleRocketTopRight));
        view.simpleRender(RectangleController.rectangle(rectRocket1));
        view.inlineRender(TriangleController.bottomRightTriangle(triangleRocketWingTopLeft), RectangleController.rectangle(rectRocket2),
                TriangleController.bottomLeftTriangle(triangleRocketWingTopRight));
        view.simpleRender(RectangleController.rectangle(rectRocket1));
        view.inlineRender(TriangleController.bottomRightTriangle(triangleRocketWingBottomLeft), RectangleController.rectangle(rectRocketBottom),
                TriangleController.bottomLeftTriangle(triangleRocketWingBottomRIght));
    }
}
