package Test2_V2_Strategy;

public class CafeneauStrategyMain {
    public static void main(String ...args){

        Beverage bautura = new Beverage(new CoffeeStrategy());
        System.out.println("Preparare cafea:");
        bautura.prepareBeverage();

        System.out.println("------------------");
        System.out.println("Preparare ceai:");
        bautura = new Beverage(new TeaStrategy());
        bautura.prepareBeverage();
    }
}
