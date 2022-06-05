package Patterns.Structural.Flyweight;

import java.util.HashMap;

public class CarFactory {
    static HashMap<String,CarType> carTypeHashMap = new HashMap<>();

    public static CarType getCarType(String name, Color color, String carInfo) {
        CarType carType = carTypeHashMap.get(name);
        if (carType == null) {
            carType = new CarType(name, color, carInfo);
            carTypeHashMap.put(name, carType);
        }
        return carType;

    }

}
