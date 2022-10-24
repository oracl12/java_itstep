package program2_task19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class DispatcherTest {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Andriy", "Lviv", 2001, true));
        persons.add(new Person("Natalia", "Odessa", 2002, false));
        persons.add(new Person("Ostap", "123", 2003, true));
        persons.add(new Person("Igor", "123", 2004, false));
        boolean shouldNotBreak = true;

        while (shouldNotBreak) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter number: ");
            String choice = myObj.nextLine();
            switch (choice) {
                case ("1") -> View.view(new ArrayList<>(Compares.caseOne(persons)));
                case ("2") -> View.view(new ArrayList<>(Compares.caseTwo(persons)));
                case ("3") -> View.view(new ArrayList<>(Compares.caseThree(persons)));
                case ("q") -> shouldNotBreak = false;
                default -> View.view(new ArrayList<>(Compares.caseDefault(persons)));
            }
        }
    }


}
