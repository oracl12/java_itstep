package program2_inheritance.plains;

import program2_inheritance.basic_models.Plain;

public class PassengerPlain extends Plain {
    private int maxLuggage;

    public int getMaxLuggage(){
        return maxLuggage;
    }
    public void setMaxLuggage(int value){
        maxLuggage = value;
    }
}
