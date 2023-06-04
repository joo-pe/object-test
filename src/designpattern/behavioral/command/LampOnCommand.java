package designpattern.behavioral.command;

public class LampOnCommand implements Command {
    private Lamp theLamp;
    public LampOnCommand(Lamp theLamp) { this.theLamp = theLamp; }
    // Command 인터페이스의 execute 메서드
    public void execute() { theLamp.turnOn(); }
}
