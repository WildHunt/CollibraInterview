package Tests;


public class Diesel implements Engine{
    private double fuelConsuption = 5.5;

    @Override
    public double getFuelConsuption() {
        return this.fuelConsuption + 1;
    }
}
