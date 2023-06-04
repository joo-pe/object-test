package designpattern.behavioral.status;

public class DownState implements ElevatorState {
    private static DownState downState;

    private DownState() {}

    public static DownState getInstance() {
        if (downState == null) {
            downState = new DownState();
        }
        return downState;
    }

    @Override
    public void pushUpButton() {
        System.out.println("올라감");
    }

    @Override
    public void pushDownButton() {
        System.out.println("동작 없음");
    }

    @Override
    public void pushStopButton() {
        System.out.println("멈춤");
    }
}
