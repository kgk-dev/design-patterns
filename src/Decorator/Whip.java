package Decorator;

public class Whip extends CondimentDecorator {
    public  Whip(Beverage beverage) {
        bev = beverage;
    }
    @Override
    public double cost() {
        return bev.cost() + .10;
    }

    @Override
    public String getDescription() {
        return bev.getDescription() + ", Whip";
    }
}
