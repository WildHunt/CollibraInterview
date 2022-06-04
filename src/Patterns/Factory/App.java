package Patterns.Factory;

public class App {
    public static void main(String[] args) {
//        Car fistCar = new Gasoline();
//        fistCar.runCar();
//        CarFactory carGasolineFactory = new GasolineFactory();
//        Car gasolineCar = carGasolineFactory.createCar();
//        gasolineCar.runCar();

        Car diesel = FuelType("diesel").createCar();
        diesel.runCar();
    }

    static CarFactory FuelType (String fuel){
        if (fuel.equalsIgnoreCase("gasoline"))
            return new GasolineFactory();
        else if (fuel.equalsIgnoreCase("diesel"))
            return new DieselFactory();
        else
            throw  new RuntimeException( fuel + "Fuel type doesn't match");
    }

}
