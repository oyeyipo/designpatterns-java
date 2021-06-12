package designpatterns.decorator.starbuzz;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip Cream";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
