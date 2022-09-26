package program2_inheritance.autos;

import program2_inheritance.basic_models.Auto;

public class LightAuto extends Auto {
    private Boolean isSuperCar;

    public Boolean getIsSuperCar(){
        return isSuperCar;
    }
    public void setIsSuperCar(boolean value){
        isSuperCar = value;
    }
}
