package program2_inheritance.basic_models;

import program2_inheritance.Vehicle;

public class Auto extends Vehicle {
    int maxRange;
    String carNumber;

    public Auto(int maxRangeValue, String carNumberValue, String sizeValue, int speedValue) {
        super(sizeValue, speedValue);

        maxRange = maxRangeValue;
        carNumber = carNumberValue;
    }
}
