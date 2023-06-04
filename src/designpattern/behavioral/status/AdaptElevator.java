package designpattern.behavioral.status;

public class AdaptElevator {
    private ElevatorState elevatorState;

    public AdaptElevator() {
        this.elevatorState = StopState.getInstance();
    }

    public void setElevatorState(ElevatorState state) {
        this.elevatorState = state;
    }

    public void pushUpButton() {
        elevatorState.pushUpButton();
        this.setElevatorState(UpState.getInstance());
    }

    public void pushDownButton() {
        elevatorState.pushDownButton();
        this.setElevatorState(DownState.getInstance());
    }

    public void pushStopButton() {
        elevatorState.pushStopButton();
        this.setElevatorState(StopState.getInstance());
    }
}
