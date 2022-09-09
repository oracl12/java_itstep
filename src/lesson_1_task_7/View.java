package lesson_1_task_7;

public class View {
    void simpleRender(int pass, String figure) {
        String res_string = "";
        String[] figure_arr = figure.split("\n");
        for (int j = 0; j < figure_arr.length; j++) {
            for (int i = 0; i < pass; i++) {
                res_string += ' ';
            }
            res_string += figure_arr[j];
            if (j + 1 != figure_arr.length) {
                res_string += "\n";
            }
        }
        System.out.println(res_string);
    }

    void inlineRender(int pass, String... args) {
        String res_string = "";
        int biggest_size = sizeBiggestFigure(args);
        for (int i = 0; i < biggest_size + 1; i++) {
            for (int k = 0; k < pass; k++) {
                res_string += ' ';
            }
            for (String arg : args) {
                res_string += arg.split("\n")[i];
            }
            if (biggest_size != i) {
                res_string += "\n";
            }
        }
        System.out.println(res_string);
    }

    void verticalRender(String... args) {
        String res_string = "";
        for (String arg : args) {
            res_string += arg;
        }
        System.out.println(res_string);
    }

    private int sizeBiggestFigure(String[] figures) {
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
