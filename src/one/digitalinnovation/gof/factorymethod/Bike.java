package one.digitalinnovation.gof.factorymethod;

public class Bike implements Product {
    @Override
    public void use() {
        System.out.println("Riding a bike");
    }
}