package Facade;

public class ConcreteStreamingPlayer implements StreamingPlayer{
    @Override
    public void on() {
        System.out.println("[ConcreteStreamingPlayer] on");
    }

    @Override
    public void off() {
        System.out.println("[ConcreteStreamingPlayer] off");
    }

    @Override
    public void stop() {
        System.out.println("[ConcreteStreamingPlayer] stop");
    }

    @Override
    public void play(String movie) {
        System.out.println("[ConcreteStreamingPlayer] playing " + movie);
    }
}
