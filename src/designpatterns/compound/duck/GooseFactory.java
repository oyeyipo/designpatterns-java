package designpatterns.compound.duck;

public class GooseFactory extends AbstractGooseFactory {

    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }

}
