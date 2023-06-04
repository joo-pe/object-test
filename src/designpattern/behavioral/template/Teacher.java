package designpattern.behavioral.template;

public abstract class Teacher {

    public void start_class() {
        inside();
        attendance();
        teach();
        outside();
    }

    // 공통 메서드
    public void inside() {
        System.out.println("선생님이 강의실로 들어옵니다.");
    }

    public void attendance() {
        System.out.println("선생님이 출석을 부릅니다.");
    }

    public void outside() {
        System.out.println("선생님이 강의실을 나갑니다.");
    }

    // 추상 메서드
    abstract void teach();
}
