package designpattern.structural.composite;

public class Main {
    public static void main(String[] args) {
        //Initialize four ellipses
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        //Initialize three composite graphics
        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();

        //Composes the graphics
        graphic1.add(ellipse1); // children - leaf
        graphic1.add(ellipse2); // children - leaf
        graphic1.add(ellipse3); // children - leaf

        graphic2.add(ellipse4); // children - leaf

        graphic.add(graphic1); // children - composite
        graphic.add(graphic2); // children - composite

        //Prints the complete graphic (Four times the string "Ellipse").
        graphic.print();
    }

}
