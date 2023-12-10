package Adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        Duck duck = new ConcreteDuck();
        Turkey turkey = new ConcreteTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.quick();
        turkeyAdapter.fly();
        Turkey duckAdatper = new DuckAdapter(duck);
        duckAdatper.gooble();
        duckAdatper.fly();
    }
}
