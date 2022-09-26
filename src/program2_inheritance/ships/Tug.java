package program2_inheritance.ships;

import program2_inheritance.basic_models.Ship;

public class Tug extends Ship {
    private int maxShipsToTugAtOnce;
    private int maxWeightOfCarriedShips;

    public int getMaxShipsToTugAtOnce(){
        return maxShipsToTugAtOnce;
    }
    public int getMaxWeightOfCarriedShips(){
        return maxWeightOfCarriedShips;
    }

    public void setMaxShipsToTugAtOnce(int value){
        maxShipsToTugAtOnce = value;
    }
    public void setMaxWeightOfCarriedShips(int value){
        maxWeightOfCarriedShips = value;
    }
}
