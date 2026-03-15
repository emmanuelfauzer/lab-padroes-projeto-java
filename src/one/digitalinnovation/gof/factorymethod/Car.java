package one.digitalinnovation.gof.factorymethod;

public class Car implements Product {
    @Override
    public void use() {
        System.out.println("Driving a car");
    }
}