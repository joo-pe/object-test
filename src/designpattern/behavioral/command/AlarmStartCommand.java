package designpattern.behavioral.command;

public class AlarmStartCommand implements Command{

    private Alarm theAlarm;
    public AlarmStartCommand(Alarm theAlarm) { this.theAlarm = theAlarm; }

    @Override
    public void execute() {
        theAlarm.start();
    }
}
