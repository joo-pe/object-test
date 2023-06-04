package designpattern.creational.builder.gof;

public class TextBuilder implements Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("===================\n")
                .append("[" + title + "]\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("- " + str + "\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            buffer.append("  - " + item + "\n");
        }
    }

    @Override
    public void close() {
        buffer.append("===================\n");
    }

    @Override
    public String getResult() {
        return buffer.toString();
    }
}
