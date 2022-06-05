package Patterns.Structural.Flyweight;

public class App {
    public static void main(String[] args) {

        /**
         * Instead of this
         *         CarFactory.carTypeHashMap.put("VW",new CarType("Sedan", Color.BLUE,"Pasat"));
         *         CarFactory.carTypeHashMap.put("Audi",new CarType("roadster", Color.BLUE,"TT"));
         */

        for (int i=0; i<10;i++) {
            CarFactory.getCarType("Audi", Color.BLUE, "TT");
            CarFactory.getCarType("VW", Color.BLUE,"Pasat");
        }
        System.out.println(CarFactory.carTypeHashMap.size());
        /**
         * Still 2 objects, instead of 20
         */
    }
}
