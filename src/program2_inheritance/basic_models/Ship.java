package program2_inheritance.basic_models;

import program2_inheritance.Vehicle;

public class Ship extends Vehicle {
    private boolean hasValidLicense;
    private String capitan;

    public String getCapitan(){
        return capitan;
    }
    public boolean getHasValidLicense(){
        return hasValidLicense;
    }

    public void setCapitan(String value){
        capitan = value;
    }
    public void setHasValidLicense(boolean value){
        hasValidLicense = value;
    }
}
