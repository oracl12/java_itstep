package program2_inheritance.plains;

import program2_inheritance.basic_models.Plain;

public class TransportPlain extends Plain {
    private String productType;

    public String getProductType(){
        return productType;
    }
    public void setProductType(String value){
        productType = value;
    }
}
