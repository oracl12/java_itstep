package program2_task19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Compares {
    public static List<Person> caseOne(ArrayList<Person> persons){
        return persons.stream()
                .sorted(Comparator.comparing(Person::getRegion)
                        .thenComparing(Person::getName).thenComparing(Person::getIsMale).thenComparing(Person::getBirthYear)).toList();
    }

    public static List<Person> caseTwo(ArrayList<Person> persons){
        return persons.stream()
                .sorted(Comparator.comparing(Person::getBirthYear)
                        .thenComparing(Person::getIsMale).thenComparing(Person::getName).thenComparing(Person::getRegion)).toList();
    }

    public static List<Person> caseThree(ArrayList<Person> persons){
        return persons.stream()
                .sorted(Comparator.comparing(Person::getIsMale)
                        .thenComparing(Person::getName).thenComparing(Person::getRegion).thenComparing(Person::getBirthYear)).toList();
    }

    public static List<Person> caseDefault(ArrayList<Person> persons){
        return persons.stream()
                .sorted(Comparator.comparing(Person::getName)
                        .thenComparing(Person::getRegion).thenComparing(Person::getBirthYear).thenComparing(Person::getIsMale)).toList();
    }
}
