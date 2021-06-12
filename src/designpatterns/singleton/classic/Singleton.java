package designpatterns.singleton.classic;

public class Singleton {
    private static Singleton uniqueInstance;

    // other useful instance variable here

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a classic Singleton!";
    }

}
