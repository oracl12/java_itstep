package program2_task19;

import java.util.ArrayList;

public class View {
    public static void view(ArrayList<Person> persons){
        for (int i = 0; i< persons.size(); i++) {
            System.out.printf("%s) %s - %s - %s - %s %n", i+1, persons.get(i).getName(), persons.get(i).getRegion(),
                    persons.get(i).getBirthYear(), persons.get(i).getIsMale());
            System.out.println('x' * 30);
        }
    }
}
