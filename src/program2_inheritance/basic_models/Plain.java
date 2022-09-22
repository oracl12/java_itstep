package program2_inheritance.basic_models;

import program2_inheritance.Vehicle;

public class Plain extends Vehicle {
    int maxFlyHeight;

    public Plain(int maxFlyHeightValue, String sizeValue, int speedValue){
        super(sizeValue, speedValue);
        maxFlyHeight = maxFlyHeightValue;
    }
}
