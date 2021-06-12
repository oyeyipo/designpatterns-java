package designpatterns.singleton.classic;

public class SingletonClient {

    public static void main(String[] args) throws Exception {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }

}
