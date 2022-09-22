package program2_inheritance.autos;

import program2_inheritance.basic_models.Auto;

public class LightAuto extends Auto {
    Boolean isSuperCar;
    int places;

    public LightAuto( Boolean isSuperCarValue, int placesValue, int maxRangeValue, String carNumberValue, String sizeValue, int speedValue) {
        super(maxRangeValue, carNumberValue, sizeValue, speedValue);
        isSuperCar = isSuperCarValue;
        places = placesValue;
    }
}
