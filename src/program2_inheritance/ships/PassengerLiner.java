package program2_inheritance.ships;

import program2_inheritance.basic_models.Ship;

public class PassengerLiner extends Ship {
    private String classType;
    private String maxLuggage;

    public String getClassType(){
        return classType;
    }
    public String getMaxLuggage(){
        return maxLuggage;
    }

    public void setClassType(String value){
        classType = value;
    }
    public void setMaxLuggage(String value){
        maxLuggage = value;
    }
}
