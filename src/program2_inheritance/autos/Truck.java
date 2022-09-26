package program2_inheritance.autos;

import program2_inheritance.basic_models.Auto;

public class Truck extends Auto {
    private boolean withTrailer;

    public Boolean getWithTrailer(){
        return withTrailer;
    }
    public void setWithTrailer(boolean value){
        withTrailer = value;
    }
}
