package Factory;

public class NYPizzaStore extends PizzsStore{
    @Override
    public Pizza cratePizzaStore(String type) {
        switch (type) {
            case "cheese":
                return new NYCheesePizza();
        }
        return  null;
    }
}
