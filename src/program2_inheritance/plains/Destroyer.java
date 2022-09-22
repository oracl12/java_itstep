package program2_inheritance.plains;

import program2_inheritance.basic_models.Plain;

public class Destroyer extends Plain {
    int rocketsNum;
    int peopleInCabin;

    public Destroyer(int rocketsNumValue, int peopleInCabinValue, int maxFlyHeightValue, String sizeValue, int speedValue) {
        super(maxFlyHeightValue, sizeValue, speedValue);
        rocketsNum = rocketsNumValue;
        peopleInCabin = peopleInCabinValue;
    }
}
