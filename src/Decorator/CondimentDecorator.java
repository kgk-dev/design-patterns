package Decorator;

public abstract class CondimentDecorator extends Beverage{
    Beverage bev;
    public abstract String getDescription();
}
