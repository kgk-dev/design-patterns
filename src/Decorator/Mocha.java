package Decorator;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        bev = beverage;
    }
    @Override
    public double cost() {
        return bev.cost() + .2;
    }

    @Override
    public String getDescription() {
        return bev.getDescription() + ", Mocha";
    }
}
