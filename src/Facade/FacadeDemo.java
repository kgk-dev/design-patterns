package Facade;

public class FacadeDemo {
    public static void main(String[] args) {
        Amplifier amp = new ConcreteAmplifier();
        Tuner tuner =new ConcreteTuner();
        PopcornPopper popper = new ConcretePopper();
        Projector projector = new ConcreteProjector();
        Screen screen = new ConcreteScreen();
        StreamingPlayer streamingPlayer = new ConcreteStreamingPlayer();
        TheaterLights lights = new ConcreteTheaterLights();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp, tuner, streamingPlayer, projector, lights, screen, popper);
        homeTheaterFacade.watchMovie("Catch me if you can");
        homeTheaterFacade.endMovie();
    }
}
