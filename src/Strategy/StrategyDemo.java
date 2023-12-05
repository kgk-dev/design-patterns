package Strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        System.out.println("Strategy Pattern");

        Duck mallar = new MallarDuck();
        mallar.Fly();
        mallar.Quack();
        mallar.swim();
        mallar.display();
        mallar.setFly(new FlywithWing());
        mallar.setQuack(new Moutquack());
        mallar.Fly();
        mallar.Quack();
    }
}
