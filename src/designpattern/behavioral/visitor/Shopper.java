package designpattern.behavioral.visitor;

public class Shopper implements Visitor {
    @Override
    public void visit(Cart cart) {
        System.out.println("카트를 사용합니다.");
    }

    @Override
    public void visit(Snack snack) {
        System.out.println("과자를 카트에 넣습니다.");
    }

    @Override
    public void visit(Milk milk) {
        System.out.println("우유를 카트에 넣습니다.");
    }
}
