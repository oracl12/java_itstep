package program2_inheritance.ships;

import program2_inheritance.basic_models.Ship;

public class Tug extends Ship {
    int maxShipsToTugAtOnce;

    public Tug(int maxShipsToTugAtOnceValue, int maxWeightCarryValue, String sizeValue, int speedValue) {
        super(maxWeightCarryValue, sizeValue, speedValue);
        maxShipsToTugAtOnce = maxShipsToTugAtOnceValue;
    }
}
