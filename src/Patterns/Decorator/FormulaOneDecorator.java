package Patterns.Decorator;

public class FormulaOneDecorator implements FormulaOne{

    public FormulaOne formulaOne;
    public int position;
    public Tires tires;
    public String alliance;

    /**
     *
     * @param alliance - new additional functionality to the existing logic
     */
    public FormulaOneDecorator(FormulaOne formulaOne, int position, Tires tires, String alliance) {
        this.formulaOne = formulaOne;
        this.position = position;
        this.tires = tires;
        this.alliance = alliance;
    }

    @Override
    public void startRace(int position) {
        this.position = position;

    }

    @Override
    public void pitStop(Tires tires) {
        this.tires = tires;
    }
}
