package designpatterns.decorator.starbuzz;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decafinated Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }

}
