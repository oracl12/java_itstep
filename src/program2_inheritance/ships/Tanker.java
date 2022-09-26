package program2_inheritance.ships;

import program2_inheritance.basic_models.Ship;

public class Tanker extends Ship {
    private String productType;
    private boolean isArcticType;

    public String getProductType(){
        return productType;
    }
    public boolean getIsArcticType(){
        return isArcticType;
    }

    public void setProductType(String value){
        productType = value;
    }
    public void setIsArcticType(boolean value){
        isArcticType = value;
    }
}
