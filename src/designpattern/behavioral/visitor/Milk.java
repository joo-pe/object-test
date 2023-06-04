package designpattern.behavioral.visitor;

public class Milk implements Element {
    @Override
    public void accept(Visitor visitor) {
        System.out.println("우유가 준비되었습니다.");
        visitor.visit(this);
    }
}
