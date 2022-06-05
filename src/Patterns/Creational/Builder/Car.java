package Patterns.Creational.Builder;

public class Car {
    private final CarType carType;
    private final Engine engine;

    public Car(CarType carType, Engine engine) {
        this.carType = carType;
        this.engine = engine;
    }

    public CarType getCarType() {
        return carType;
    }

    public Engine getEngine() {
        return engine;
    }
}
