package Factory;

public class ChicacoCheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("[ChicacoCheese] preparing...");
    }

    @Override
    public void bake() {
        System.out.println("[ChicacoCheese] baking...");
    }

    @Override
    public void cut() {
        System.out.println("[ChicacoCheese] cutting...");
    }

    @Override
    public void box() {
        System.out.println("[ChicacoCheese] boxing...");
    }
}
