package Factory;

public class FactoryDemo {
    public static void main(String[] args) {
        PizzsStore ny = new NYPizzaStore();
        PizzsStore cc = new ChicacoPizzaStore();
        Pizza nyCheese = ny.cratePizzaStore("cheese");
        nyCheese.prepare();
        nyCheese.bake();
        nyCheese.cut();
        nyCheese.box();
        Pizza ccCheese = cc.cratePizzaStore("cheese");
        ccCheese.prepare();
        ccCheese.bake();
        ccCheese.cut();;
        ccCheese.box();
    }
}
