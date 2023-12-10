package Adapter;

public class ConcreteTurkey implements Turkey{
    @Override
    public void gooble() {
        System.out.println("[Turkey] gooble gooble gooble...");
    }

    @Override
    public void fly() {
        System.out.println("[Turkey] fly fly fly...");
    }
}
