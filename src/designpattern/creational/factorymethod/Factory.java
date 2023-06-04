package designpattern.creational.factorymethod;

public abstract class Factory {

    public final Product create(String prodName) throws Exception {
        //Factory factory = ProductType.compareTo(prodName);
        //return factory.create(prodName);
        return new Product();
    }
}
