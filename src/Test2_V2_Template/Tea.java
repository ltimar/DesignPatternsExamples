package Test2_V2_Template;

public class Tea extends Beverage{
    @Override
    void boilWater() {
        System.out.println("Boil water for tea");
    }

    @Override
    void step1() {
        putTeaInfusion();
    }

    @Override
    void pourInCup() {
        System.out.println("Pour water in cup for caffee");
    }

    @Override
    void step2() {
        addLemon();
        addHoney();
    }

    @Override
    void stearAndServe() {
        System.out.println("Coffee ready: stear and serve");
    }

    private void putTeaInfusion(){
        System.out.println("Add tea infusion");
    }

    private void addLemon(){
        System.out.println("Add lemon to tea");
    }
    private void addHoney(){
        System.out.println("Add honey to tea");
    }
}
