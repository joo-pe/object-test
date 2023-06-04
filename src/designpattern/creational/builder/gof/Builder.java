package designpattern.creational.builder.gof;

public interface Builder {

    void makeTitle(String title);
    void makeString(String str);
    void makeItems(String[] items);
    void close();
    String getResult();
}
