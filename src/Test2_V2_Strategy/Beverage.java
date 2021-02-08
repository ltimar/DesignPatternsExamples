package Test2_V2_Strategy;

public class Beverage {
    PreparationStrategy prepStrategy;
    public Beverage(PreparationStrategy prepStra){
        this.prepStrategy = prepStra;
    }

    protected void boilWater(){
        System.out.println("Boil water");
    }

    protected void pourInCup(){
        System.out.println("Pour water in cup");
    }
    //abstract void addMilk();       abstract void addLemon();
    //abstract void addSugar();      abstract void addHoney();
    //abstract void addFoam();
    protected void stearAndServe(){
        System.out.println("Beverage ready: stear and serve");
    }

    public final void prepareBeverage() {
        this.boilWater();
        prepStrategy.step1();
        this.pourInCup();
        prepStrategy.step2();
        this.stearAndServe();
    }
}
