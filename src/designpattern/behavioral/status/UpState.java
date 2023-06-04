package designpattern.behavioral.status;

public class UpState implements ElevatorState {
    private static UpState upState;

    private UpState() {}

    public static UpState getInstance() {
        if (upState == null) {
            upState = new UpState();
        }
        return upState;
    }

    @Override
    public void pushUpButton() {
        System.out.println("동작 없음");
    }

    @Override
    public void pushDownButton() {
        System.out.println("내려감");
    }

    @Override
    public void pushStopButton() {
        System.out.println("멈춤");
    }
}
