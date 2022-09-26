package program2_inheritance;

public class Vehicle {
    private int height;
    private int width;
    private int maxSpeed;
    private int maxPeopleInside;
    private int maxWeightCarry;

    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public int getMaxPeopleInside(){
        return maxPeopleInside;
    }
    public int getMaxWeightCarry(){
        return maxWeightCarry;
    }

    public void setHeight(int value){
        height = value;
    }
    public void setWidth(int value){
        width = value;
    }
    public void setMaxSpeed(int value){
        maxSpeed = value;
    }
    public void setMaxPeopleInside(int value){
        maxPeopleInside = value;
    }
    public void setMaxWeightCarry(int value){
        maxWeightCarry = value;
    }
}
