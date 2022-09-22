package program2_inheritance.autos;

import program2_inheritance.basic_models.Auto;

public class Bus extends Auto {
    int maxPeople;
    int level;


    public Bus(int maxPeopleValue, int levelValue, int maxRangeValue, String carNumberValue, String sizeValue, int speedValue) {
        super(maxRangeValue, carNumberValue, sizeValue, speedValue);
        maxPeople = maxPeopleValue;
        level = levelValue;
    }
}
