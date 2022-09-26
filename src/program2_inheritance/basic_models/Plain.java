package program2_inheritance.basic_models;

import program2_inheritance.Vehicle;

public class Plain extends Vehicle {
    private boolean hasValidLicense;
    private String pilot;
    private String airportSigned;

    public String getPilot(){
        return pilot;
    }
    public String getAirportSigned(){
        return airportSigned;
    }
    public boolean getHasValidLicense(){
        return hasValidLicense;
    }

    public void setPilot(String value){
        pilot = value;
    }
    public void setAirportSigned(String value){
        airportSigned = value;
    }
    public void setHasValidLicense(boolean value){
        hasValidLicense = value;
    }
}
