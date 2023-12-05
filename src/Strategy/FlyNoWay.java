package Strategy;

public class FlyNoWay implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Flying no way...");
    }
}
