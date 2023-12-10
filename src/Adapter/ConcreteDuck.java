package Adapter;

public class ConcreteDuck implements Duck{

    @Override
    public void quick() {
        System.out.println("[Duck] quick quick quick...");
    }

    @Override
    public void fly() {
        System.out.println("[Duck] fly fly fly...");
    }
}
