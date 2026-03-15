package one.digitalinnovation.gof.factorymethod;

public class CarFactory extends Creator {
    @Override
    public Product factoryMethod() {
        return new Car();
    }
}