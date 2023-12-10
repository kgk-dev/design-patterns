package Facade;

public class ConcretePopper implements PopcornPopper{
    @Override
    public void on() {
        System.out.println("[ConcretePopper] on");
    }

    @Override
    public void off() {
        System.out.println("[ConcretePopper] off");
    }

    @Override
    public void pop() {
        System.out.println("[ConcretePopper] pop");
    }
}
