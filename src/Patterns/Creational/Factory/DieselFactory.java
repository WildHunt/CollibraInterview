package Patterns.Creational.Factory;

public class DieselFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Diesel();
    }
}
