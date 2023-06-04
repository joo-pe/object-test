package designpattern.creational.builder.gof;

public class HtmlBuilder implements Builder {
    private String html = "";

    @Override
    public void makeTitle(String title) {
        html += "<html><head><title>" + title + "</title></head>\n"
                + "<body>\n"
                + "<h1>" + title + "</h1>\n";
    }

    @Override
    public void makeString(String str) {
        html += "<p>" + str + "</p>\n";
    }

    @Override
    public void makeItems(String[] items) {
        html += "<ul>\n";
        for (String item : items) {
            html += "<li>" + item + "</li>\n";
        }
        html += "</ul>\n";
    }

    @Override
    public void close() {
        html += "</body></html>";
    }

    @Override
    public String getResult() {
        return html;
    }
}
