package Patterns.Factory;

public class GasolineFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Gasoline();
    }
}
