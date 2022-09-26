package program2_inheritance.plains;

import program2_inheritance.basic_models.Plain;

public class Destroyer extends Plain {
    private int rocketsNum;

    protected int getRocketsNum(){
        return rocketsNum;
    }
    protected void setRocketsNum(int value){
        rocketsNum = value;
    }
}
