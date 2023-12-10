package Facade;

public class ConcreteTheaterLights implements TheaterLights{
    @Override
    public void dim(int i) {
        System.out.println("[ConcreteTheaterLights] dim " + i);
    }

    @Override
    public void off() {
        System.out.println("[ConcreteTheaterLights] off");
    }

    @Override
    public void on() {
        System.out.println("[ConcreteTheaterLights] on");
    }
}
