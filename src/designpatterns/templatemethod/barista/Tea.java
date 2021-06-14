package designpatterns.templatemethod.barista;

public class Tea extends CaffieneBeverage {

    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

    public void brew() {
        System.out.println("Steeping the tea");
    }

}
