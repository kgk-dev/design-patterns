package Facade;

public class ConcreteAmplifier implements Amplifier{
    @Override
    public void on() {
        System.out.println("[ConcreteAmplifier] on");
    }

    @Override
    public void off() {
        System.out.println("[ConcreteAmplifier] off");
    }

    @Override
    public void setStreamPlayer(StreamingPlayer player) {
        System.out.println("[ConcreteAmplifier] Set Stream Player " + player);
    }

    @Override
    public void setSurroundSound() {
        System.out.println("[ConcreteAmplifier] Set Surronund Sound...");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("[ConcreteAmplifier] Set volume " + volume);
    }
}
