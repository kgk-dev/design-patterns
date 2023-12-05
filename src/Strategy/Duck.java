package Strategy;

public abstract class Duck {
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    abstract  public void swim();
    abstract  public  void display();

    public void Fly() {
        flyBehaviour.fly();
    }

    public void Quack() {
        quackBehaviour.quack();
    }

    public void setFly(FlyBehaviour f) {
        this.flyBehaviour = f;
    }

    public void setQuack(QuackBehaviour q) {
        this.quackBehaviour = q;
    }
}
