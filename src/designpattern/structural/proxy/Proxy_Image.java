package designpattern.structural.proxy;

public class Proxy_Image implements Image {
    private String fileName;
    private Real_Image realImage;

    public Proxy_Image(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
        if (realImage == null) {
            realImage = new Real_Image(fileName);
        }
        realImage.displayImage();
    }
}
