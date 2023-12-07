package Factory;

public abstract class PizzsStore {
    Pizza pizza;
    public void createPizza(String type) {
        pizza = cratePizzaStore(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
    abstract public Pizza cratePizzaStore(String type);
}
