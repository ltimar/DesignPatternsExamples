package Test2_V2_Template;

public abstract class Beverage {
    abstract void boilWater();

    abstract void step1(); //    abstract void grindBeans();    abstract void putTeaInfusion();
    abstract void pourInCup();
    abstract void step2();
    //abstract void addMilk();       abstract void addLemon();
    //abstract void addSugar();      abstract void addHoney();
    //abstract void addFoam();
    abstract void stearAndServe();

    // metoda template
    public final void prepareBeverage(){
        this.boilWater();
        this.step1();
        this.pourInCup();
        this.step2();
        this.stearAndServe();
    }
}
