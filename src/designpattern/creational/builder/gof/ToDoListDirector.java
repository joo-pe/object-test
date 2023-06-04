package designpattern.creational.builder.gof;

public class ToDoListDirector {
    private Builder builder;

    public ToDoListDirector(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("TODO List");
        builder.makeString("아침에 할 일");
        builder.makeItems(new String[]{"조깅", "세탁기 돌리기"});
        builder.makeString("저녁에 할 일");
        builder.makeItems(new String[] {"청소하기", "공부하기", "다음날 출근 준비"});
        builder.close();
    }
}
