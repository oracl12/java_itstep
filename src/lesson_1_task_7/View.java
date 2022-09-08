package lesson_1_task_7;

public class View {
    void simpleRender(String figure) {
        System.out.println(figure);
    }

    void inlineRender(int pass, String... args) {
        String res_string = "";
        int biggest_size = sizeBiggestFigure(args);
        for (int i = 0; i < biggest_size + 1; i++) {
            for (int k = 0; k < pass; k++){
                res_string += ' ';
            }
            for (int j = 0; j < args.length; j++) {
                res_string += args[j].split("\n")[i];
            }
            if (biggest_size != i) {
                res_string += "\n";
            }
        }
        System.out.println(res_string);
    }

    void verticalRender(String... args) {
        String res_string = "";
        for (int j = 0; j < args.length; j++) {
            res_string += args[j];
        }
        System.out.println(res_string);
    }

    private

    int sizeBiggestFigure(String[] figures) {
        int max = 0;
        for (String figure : figures) {
            String[] test = figure.split("\n");
            if (test.length > max) {
                max = test.length;
            }
        }
        return max - 1;
    }
}
