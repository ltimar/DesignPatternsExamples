package Test2_V2_Strategy;

public class TeaStrategy implements PreparationStrategy{

    @Override
    public void step1() {
        putTeaInfusion();
    }

    @Override
    public void step2() {
        addLemon();
        addHoney();
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
