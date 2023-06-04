package designpattern.behavioral.chainofResponse;

public class Odd_Receiver extends Receiver {

    public Odd_Receiver(String name)
    {
        super(name);
    }

    public boolean resolve(int number) //해당 숫자가 홀수일 경우 true 반환
    {
        if(number%2!=0)
            return true;
        else
            return false;
    }
    public void done(int number)
    {
        System.out.println(number +":" + name+"가 해결");
    }
}
