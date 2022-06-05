package Patterns.Structural.Decorator;

public class Mclaren implements FormulaOne{
    public int position;
    public Tires tires;

    @Override
    public void startRace(int position) {
        this.position = position;

    }

    @Override
    public void pitStop(Tires tires) {
        this.tires = tires;
    }
}
