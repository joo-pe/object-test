package designpattern.behavioral.status;

public class Client {

    public static void main(String[] args) {
        AdaptElevator elevator = new AdaptElevator();

        elevator.pushStopButton();
        elevator.pushDownButton();
        elevator.pushStopButton();
        elevator.pushUpButton();
        elevator.pushStopButton();
        elevator.pushUpButton();
        elevator.pushUpButton();
    }
}
