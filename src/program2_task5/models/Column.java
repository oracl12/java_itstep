package program2_task5.models;

import java.util.ArrayList;
import java.util.Arrays;

public class Column {
    public String naming;
    int maxValuesIn;

    public ArrayList<Column> nestedColumns;
    public ArrayList<String> nestedValues;

    public Column(int maxValuesInValue, String namingValue){
        maxValuesIn = maxValuesInValue;
        naming = namingValue;
        nestedColumns = new ArrayList<>();
        nestedValues = new ArrayList<>();
    }

    public void add(Column... columns){
        nestedColumns.addAll(Arrays.asList(columns));
    }
    public void add(String... values){
        nestedValues.addAll(Arrays.asList(values));
    }
}
