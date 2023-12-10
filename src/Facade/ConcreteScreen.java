package Facade;

public class ConcreteScreen implements Screen{
    @Override
    public void down() {
        System.out.println("[ConcreteScreen] down");
    }

    @Override
    public void up() {
        System.out.println("[ConcreteScreen] up");
    }
}
