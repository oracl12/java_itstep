package program2_inheritance;

import program2_inheritance.basic_models.Auto;
import program2_inheritance.basic_models.Plain;
import program2_inheritance.basic_models.Ship;
import program2_inheritance.plains.Destroyer;
import program2_inheritance.plains.PassengerPlain;
import program2_inheritance.plains.TransportPlain;

public class Main {
    public static void main(String[] args) {
        Vehicle basicPlainObj = new Plain();
        Vehicle basicShipObj = new Ship();
        Vehicle basicAutoObj = new Auto();

        Plain destroyer = new Destroyer();
        Plain passengerPlain = new PassengerPlain();
        Plain transportPlanes = new TransportPlain();
    }
}
