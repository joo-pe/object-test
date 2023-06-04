package designpattern.structural.proxy;

public class Proxy_Pattern {
    public static void main(String args[]) {
        Image image1 = new Proxy_Image("test1.jpg");
        Image image2 = new Proxy_Image("test2.jpg");

        image1.displayImage();
        image2.displayImage();
    }
}
