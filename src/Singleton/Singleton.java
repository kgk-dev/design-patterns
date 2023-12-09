package Singleton;

public class Singleton {
    private static Singleton uniqueInstacne;
    private Singleton(){}
    public static Singleton getInstance() {
        if( uniqueInstacne == null ) {
            uniqueInstacne = new Singleton();
        }
        return uniqueInstacne;
    }
}
