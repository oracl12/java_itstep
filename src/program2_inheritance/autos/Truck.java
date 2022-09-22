package program2_inheritance.autos;

import program2_inheritance.basic_models.Auto;

public class Truck extends Auto {
    int maxCarrieWeight;
    int maxRun;

    public Truck(int maxCarrieWeightValue, int maxRunValue, int maxRangeValue, String carNumberValue, String sizeValue, int speedValue) {
        super(maxRangeValue, carNumberValue, sizeValue, speedValue);
        maxCarrieWeight = maxCarrieWeightValue;
        maxRun = maxRunValue;
    }
}
