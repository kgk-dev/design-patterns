package Adapter;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey t) {
        turkey = t;
    }

    @Override
    public void quick() {
        turkey.gooble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
