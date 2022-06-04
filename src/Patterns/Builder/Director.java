package Patterns.Builder;

public class Director {
    public void constructRoadsterCar(Builder builder) {
        builder.setCarType(CarType.ROADSTER);
        builder.setEngine(new Engine(1.8, 10));
    }

    public void constructCombiCar(Builder builder) {
        builder.setCarType(CarType.COMBI);
        builder.setEngine(new Engine(2.0, 6));
    }

}
