package Patterns.Structural.Flyweight;

public class CarType {
    private String name;
    private Color color;
    private String carTypeInfo;
    private Car car;

    public CarType(String name, Color color, String carTypeInfo) {
        this.name = name;
        this.color = color;
        this.carTypeInfo = carTypeInfo;
    }

    @Override
    public String toString() {
        return "CarType{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", carTypeInfo='" + carTypeInfo + '\'' +
                '}';
    }
}
