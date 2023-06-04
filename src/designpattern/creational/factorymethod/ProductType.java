package designpattern.creational.factorymethod;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ProductType {

    PIKACHU(1, "PIKACHU", new KabotFactory()),
    MAZINGA(2, "MAZINGA", new MazingaFactory()),
    KABOT(3, "KABOT", new KabotFactory());

    private Integer prodCode;
    private String prodName;
    private Factory factory;

    public static Factory compareTo(String value) throws Exception{

        for( ProductType productType : ProductType.values()) {
            if(productType.getProdName().equals(value)) {
                return productType.getFactory();
            }
        }
        return new Factory() {
            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        };
    }


}
