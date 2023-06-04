package designpattern.structural.bridge;

public class CircleDrawing implements Drawing{
    @Override
    public void drawLine(int x, int y) {
        System.out.println("Circle Draw line from " + x + " to " + y);
    }

    @Override
    public void fill() {
        System.out.println("Circle Fill!");
    }
}

