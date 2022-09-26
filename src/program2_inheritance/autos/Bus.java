package program2_inheritance.autos;

import program2_inheritance.basic_models.Auto;

public class Bus extends Auto {
    private int levelCount;

    public int getLevelCount(){
        return levelCount;
    }
    public void setLevelCount(int value){
        levelCount = value;
    }
}
