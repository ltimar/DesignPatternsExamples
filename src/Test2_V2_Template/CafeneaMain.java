package Test2_V2_Template;

public class CafeneaMain {
    public static void main(String ...args){
        Beverage bautura = new Coffee();
        System.out.println("Preparare cafea:");
        bautura.prepareBeverage();

        System.out.println("------------------");
        System.out.println("Preparare ceai:");
        bautura = new Tea();
        bautura.prepareBeverage();
    }
}
