package designpattern.structural.flyweight;

public class Tree {

    // 나무는 아래와 같이 3개 정보를 가지고 있습니다.
    private String color;
    private int x;
    private int y;

    //색상으로만 생성자를 만들어줄게요.
    public Tree(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //나무를 심을 때
    public void install(){
        System.out.println("x:"+x+" y:"+y+" 위치에 "+color+"색 나무를 설치했습니다!");
    }
}
