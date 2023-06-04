package designpattern.creational.prototype;

public class Cookie implements Cloneable{

    private String name;

    public Cookie() {
        System.out.println("Prototype call");
    }

    public Object clone() throws CloneNotSupportedException {
        Cookie copy = (Cookie) super.clone();
        return copy;
    }
}
