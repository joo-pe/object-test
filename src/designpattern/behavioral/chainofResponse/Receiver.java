package designpattern.behavioral.chainofResponse;

public abstract class Receiver {

    public String name;                    //리시버 이름
    private Receiver next=null;          //다음 수신 객체

    public Receiver(String name) {
        this.name = name;
    }

    public Receiver setNext(Receiver next) //다음에 수신 할 객체 지정
    {
        this.next = next;
        return next;
    }

    public final void support(int number) //처리
    {
        if (resolve(number))                 //해당 수신 객체가 요청 처리를 하였는지 판단
        {
            done(number);
        } else if (next != null)                //처리 요청을 못하였다면 다음 수신객체에게 처리요청
        {
            next.support(number);
        } else                          //사슬에 있는 어떠한 객체도 처리 못한 경우
        {
            System.out.println("어떤 객체도 처리하지 못함");
        }
    }
    public abstract boolean resolve(int number);
    public abstract void done(int number);
}
