package program2_task5;

import program2_task5.models.Column;
import program2_task5.models.Table;

public class View {
    static void showTable(Table table) {
        for (Column column : table.structure) {
            System.out.println("-".repeat(15));
            System.out.printf("%s:\n", column.naming);
            System.out.println("-".repeat(15));
            if (column.nestedColumns.isEmpty()) {
                printValues(column);
            } else {
                iterateOverNestedColumns(column);
            }
        }
    }

    private static void iterateOverNestedColumns(Column column) {
        for (Column nestedColumn : column.nestedColumns) {
            if (nestedColumn.nestedColumns.isEmpty()) {
                System.out.println("-".repeat(15));
                System.out.printf("%s:\n", nestedColumn.naming);
                printValues(nestedColumn);
            } else {
                iterateOverNestedColumns(nestedColumn);
            }
        }
    }

    private static void printValues(Column column) {
        for (String value : column.nestedValues) {
            System.out.println(value);
        }
    }
}
