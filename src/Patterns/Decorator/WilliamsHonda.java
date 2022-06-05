package Patterns.Decorator;

public class WilliamsHonda extends FormulaOneDecorator {
    public WilliamsHonda(FormulaOne formulaOne, int position, Tires tires, String alliance) {
        super(formulaOne, position, tires, alliance);
    }
}
