package designpattern.behavioral.chainofResponse;

public class Main {

    public static void main(String argsp[]) throws InterruptedException
    {
        Receiver odd_receiver = new Odd_Receiver("홀수 리시버");
        Receiver even_receiver = new Even_Receiver("짝수 리시버");

        odd_receiver.setNext(even_receiver);    //수신기의 처리 요청 순서를 지정

        for(int i=1;i<=20;i++)
        {
            odd_receiver.support(i);
        }
    }
}
