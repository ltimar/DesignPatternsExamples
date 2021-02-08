package Test2_V1_Decorator;

public class DecoratorVarianteDeEchipare extends BrosuraDecorata {

    public DecoratorVarianteDeEchipare(Brosura cat) {
        super(cat);
    }

    @Override
    public void printAltAccesoriu() {
        System.out.println("Variantele de echipare sunt a ....");
        System.out.println("Variantele de echipare sunt b ....");
        System.out.println("Variantele de echipare sunt v ....");
    }
}
