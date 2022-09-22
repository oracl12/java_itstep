package program2_inheritance;

import program2_inheritance.basic_models.Auto;
import program2_inheritance.basic_models.Plain;
import program2_inheritance.basic_models.Ship;
import program2_inheritance.plains.Destroyer;
import program2_inheritance.plains.PassengerPlain;
import program2_inheritance.plains.TransportPlain;

public class Main {
    public static void main(String[] args) {
        Vehicle basicPlainObj = new Plain(10, "BIG", 100);
        Vehicle basicShipObj = new Ship(13, "BIG", 1000);
        Vehicle basicAutoObj = new Auto(130, "asd", "SMALL", 12);

        Plain destroyer = new Destroyer(10, 10, 10, "BIG", 100);
        Plain passengerPlain = new PassengerPlain(10, 10, "BIG", 100);
        Plain transportPlanes = new TransportPlain("Stones", 10, 10, "BIG", 100);
    }
}
