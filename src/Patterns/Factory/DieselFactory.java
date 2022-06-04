package Patterns.Factory;

public class DieselFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Diesel();
    }
}
