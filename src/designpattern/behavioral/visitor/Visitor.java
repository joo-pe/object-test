package designpattern.behavioral.visitor;

public interface Visitor {
    public void visit(Cart cart);
    public void visit(Snack snack);
    public void visit(Milk milk);
}
