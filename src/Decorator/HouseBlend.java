package Decorator;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "House Blend Coffer";
    }
    @Override
    public double cost() {
        return .89;
    }
}
