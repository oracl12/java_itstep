package program2_task5;

import program2_task5.models.Column;
import program2_task5.models.Table;

public class Main {
    public static void main(String[] args) {
        Table table = new Table("Some name");

        Column nestedColumn11 = new Column(10, "FirstFirst");
        nestedColumn11.add("Value1", "value2", "value3");
        Column nestedColumn12 = new Column(10, "FirstSecond");
        nestedColumn12.add("Value11", "value22", "value33");
        Column nestedColumn21 = new Column(10, "SecondFirst");
        nestedColumn21.add("Value11111", "value2222", "value3333","value4444");

        Column column11 = new Column(10, "First");
        Column column12 = new Column(10, "Second");

        column11.add(nestedColumn11, nestedColumn12);
        column12.add(nestedColumn21);

        table.addColumn(column11, column12);
        View.showTable(table);
    }
}
