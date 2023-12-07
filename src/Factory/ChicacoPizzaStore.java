package Factory;

public class ChicacoPizzaStore extends PizzsStore{
    @Override
    public Pizza cratePizzaStore(String type) {
        switch (type) {
            case "cheese":
                return new ChicacoCheesePizza();
        }
        return null;
    }
}
