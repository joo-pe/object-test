package designpattern.structural.flyweight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("원하는 색을 입력해주세요 :)");
        for(int i=0;i<10;i++){
            //나무 색 입력받기
            String input = scanner.nextLine();
            //팩토리에서 나무 하나 공급받기
            Tree tree = (Tree)TreeFactory.getTree(input);
            //나무 x,y 설정하고
            tree.setX((int) (Math.random()*100));
            tree.setY((int) (Math.random()*100));
            //나무 설치하기
            tree.install();
        }

    }
}
