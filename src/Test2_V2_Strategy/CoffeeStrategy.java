package Test2_V2_Strategy;

public class CoffeeStrategy implements PreparationStrategy{
    @Override
    public void step1() {
        grindBeans();
    }

    @Override
    public void step2() {
        addMilk();
        addSugar();
        addFoam();
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
