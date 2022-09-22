package program2_inheritance.basic_models;

import program2_inheritance.Vehicle;

public class Ship extends Vehicle {
    int maxWeightCarry;

    public Ship(int maxWeightCarryValue, String sizeValue, int speedValue) {
        super(sizeValue, speedValue);

        maxWeightCarry = maxWeightCarryValue;
    }
}
