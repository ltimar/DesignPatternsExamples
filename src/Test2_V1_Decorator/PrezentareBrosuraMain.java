package Test2_V1_Decorator;

public class PrezentareBrosuraMain {

    public static void main(String args[]){
        BrosuraDecorata catalog = new DecoratorPoza(new DecoratorPret(new DecoratorVarianteDeEchipare(new BrosuraDeBaza())));

        catalog.printBrosura();
    }
}
