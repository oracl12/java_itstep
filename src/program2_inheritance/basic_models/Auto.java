package program2_inheritance.basic_models;

import program2_inheritance.Vehicle;

public class Auto extends Vehicle {
    private String mark;
    private String carNumber;

    public String getMark(){
        return mark;
    }
    public String getCarNumber(){
        return carNumber;
    }

    public void setMark(String value){
        mark = value;
    }
    public void setCarNumber(String value){
        carNumber = value;
    }
}
