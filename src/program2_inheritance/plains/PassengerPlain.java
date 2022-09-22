package program2_inheritance.plains;

import program2_inheritance.basic_models.Plain;

public class PassengerPlain extends Plain {
    int maxPassengers;

    public PassengerPlain(int maxPassengersValue, int maxFlyHeightValue, String sizeValue, int speedValue) {
        super(maxFlyHeightValue, sizeValue, speedValue);
        maxPassengers = maxPassengersValue;
    }
}
