package Strategy;

public class MallarDuck extends Duck{
    public MallarDuck() {
        this.setFly(new FlyNoWay());
        this.setQuack(new Quack());
    }

    @Override
    public void swim() {
        System.out.println("Mallar duck is swimming");
    }

    @Override
    public void display() {
        System.out.println("Mallar duck is displaying");
    }
}
