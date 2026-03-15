package one.digitalinnovation.gof.factorymethod;

public class BikeFactory extends Creator {
    @Override
    public Product factoryMethod() {
        return new Bike();
    }
}