package Adapter;

public class DuckAdapter implements Turkey{
    Duck duck;
    public DuckAdapter(Duck d) {
        duck = d;
    }
    @Override
    public void gooble() {
        duck.quick();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
