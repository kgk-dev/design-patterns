package Facade;

public class ConcreteProjector implements Projector{
    @Override
    public void on() {
        System.out.println("[ConcreteProjector] on");
    }

    @Override
    public void off() {
        System.out.println("[ConcreteProjector] off");
    }

    @Override
    public void wideScreenMode() {
        System.out.println("[ConcreteProjector] Wide Screen Mode");
    }
}
