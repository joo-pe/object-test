package designpattern.behavioral.command;

public class Button {

    private Command theCommand;

    // 생성자에서 버튼을 눌렀을 때 필요한 기능을 인지로 받는다.
    public Button(Command theCommand) {
        setCommand(theCommand);
    }

    public void setCommand(Command newCommand) {
        this.theCommand = newCommand;
    }

    // 버튼이 눌리면 주어진 Command의 execute 메서드를 호출한다.
    public void pressed() {
        theCommand.execute();
    }
}
