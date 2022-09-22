package program2_inheritance.ships;

import program2_inheritance.basic_models.Ship;

public class Tanker extends Ship {
    String productType;
    int maxRun;

    public Tanker(String productTypeValue, int maxRunValue, int maxWeightCarryValue, String sizeValue, int speedValue) {
        super(maxWeightCarryValue, sizeValue, speedValue);
        productType = productTypeValue;
        maxRun = maxRunValue;
    }
}
