package soild.test05dip;

public class Production {
    private String type;
    private int price;

    public Production(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public void updatePrice(int price) {
        this.price = price;
    }

    public String getType() {
        return this.type;
    }
}
