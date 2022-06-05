package Patterns.Creational.Builder;

public class Engine {
    private double volume;
    private double consumption;
    private boolean status;


    public Engine(double volume, double consumption) {
        this.volume = volume;
        this.consumption = consumption;
        this.status = false;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
