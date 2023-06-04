package designpattern.behavioral.visitor;

public class Client {
    public static void main(String args[]) {
        Shopper shopper = new Shopper();
        Cart cart = new Cart();
        cart.accept(shopper);
    }
}
