package designpattern.creational.singleton;

public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

    public void hello() {
        System.out.println("hi, welcome");
    }

    public static void main(String[] args) {
        Singleton singleton = new Singleton();
        Singleton singleton1 = Singleton.getInstance();
    }
}
