package Factory;

public class NYCheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("[NYCheee]preparing...");
    }

    @Override
    public void bake() {
        System.out.println("[NYCheese] baking...");
    }

    @Override
    public void cut() {
        System.out.println("[NYCheese] cutting...");
    }

    @Override
    public void box() {
        System.out.println("[NYCheese] boxing...");
    }
}
