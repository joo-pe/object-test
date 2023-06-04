package designpattern.behavioral.observer;

public class Observer {
    public String msg;

    public void receive(String msg){
        System.out.println(this.msg + "에서 메시지를 받음 : " + msg);
    }
}
