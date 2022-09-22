package program2_inheritance.plains;

import program2_inheritance.basic_models.Plain;

public class TransportPlain extends Plain {
    String productType;
    int maxWeightCarry;

    public TransportPlain(String productTypeValue, int maxWeightCarryValue, int maxFlyHeightValue, String sizeValue, int speedValue) {
        super(maxFlyHeightValue, sizeValue, speedValue);
        productType = productTypeValue;
        maxWeightCarry = maxWeightCarryValue;
    }
}
