package Patterns.Builder;

public class App {
    public static void main(String[] args) {
        Director director =  new Director();
        CarBuilder builder = new CarBuilder();
        director.constructRoadsterCar(builder);


        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());
    }
}
