package Patterns.Builder;

public class CarBuilder implements Builder {

    private CarType carType;
    private Engine engine;
    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car getResult() {
        return new Car(carType, engine);
    }

}
