package program2_task5.models;

import java.util.ArrayList;
import java.util.Arrays;

public class Table {
    String tableName;
    public ArrayList<Column> structure;

    public Table(String tableNameVales){
        tableName = tableNameVales;
        structure = new ArrayList<>();
    }

    public void addColumn(Column... newColumns){
        structure.addAll(Arrays.asList(newColumns));
    }
}
