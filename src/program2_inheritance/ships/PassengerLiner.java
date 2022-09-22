package program2_inheritance.ships;

import program2_inheritance.basic_models.Ship;

public class PassengerLiner extends Ship {
    String classType;
    int maxPeople;

    public PassengerLiner(String classTypeValue, int maxPeopleValue, int maxWeightCarryValue, String sizeValue, int speedValue) {
        super(maxWeightCarryValue, sizeValue, speedValue);
        classType = classTypeValue;
        maxPeople = maxPeopleValue;
    }
}
