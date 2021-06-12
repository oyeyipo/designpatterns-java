package designpatterns.singleton.stat;

public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    // Other usefull methods here
    public String getDescription() {
        return "I'am a statically initialized Singleton!";
    }

}
