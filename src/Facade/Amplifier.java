package Facade;

public interface Amplifier {
    void on();

    void off();

    void setStreamPlayer(StreamingPlayer player);

    void setSurroundSound();

    void setVolume(int volume);
}
