package program2_task19;

public class Person {
    String name;
    String region;
    int birthYear;
    boolean isMale;

    Person (String nameValue, String regionValue, int birthYearValue, boolean isMaleValue){
        name = nameValue;
        region = regionValue;
        birthYear = birthYearValue;
        isMale = isMaleValue;
    }

    String getName(){
        return name;
    }

    int getBirthYear(){
        return birthYear;
    }

    boolean getIsMale(){
        return isMale;
    }

    String getRegion(){
        return region;
    }
}
