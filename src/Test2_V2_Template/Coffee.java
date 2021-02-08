package Test2_V2_Template;

public class Coffee extends Beverage{
    @Override
    void boilWater() {
        System.out.println("Boil water for caffee");
    }

    @Override
    void step1() {
        grindBeans();
    }

    @Override
    void pourInCup() {
        System.out.println("Pour water in cup for caffee");
    }

    @Override
    void step2() {
        addMilk();
        addSugar();
        addFoam();
    }

    @Override
    void stearAndServe() {
        System.out.println("Coffee ready: stear and serve");
    }

    private void grindBeans(){
        System.out.println("Grind beans for coffee");
    }

    private void addMilk(){
        System.out.println("Add milk to coffee");
    }
    private void addSugar(){
        System.out.println("Add sugar to coffee");
    }
    private void addFoam(){
        System.out.println("Add foam to coffee");
    }
}
