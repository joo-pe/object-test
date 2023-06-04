package designpattern.structural.bridge;

public class BridgeMain {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(new RectDrawing());
        Shape circle = new Circle(new CircleDrawing());

        rectangle.drawLine(1, 2);
        rectangle.fill();
        rectangle.draw();

        System.out.println();

        circle.drawLine(3, 4);
        circle.fill();
        circle.draw();
    }
}
