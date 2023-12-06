package Decorator;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage) {
        bev = beverage;
    }
    @Override
    public double cost() {
        return bev.cost() + .15;
    }

    @Override
    public String getDescription() {
        return bev.getDescription() + ", Soy";
    }
}
