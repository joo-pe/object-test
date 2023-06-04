package designpattern.behavioral.mediator;

public interface Mediator {

    void addColleague(Colleague colleague);

    void mediate(Colleague colleague);
}
