package Test2_V1_Decorator;

public class DecoratorPret extends BrosuraDecorata {

    public DecoratorPret(Brosura cat) {
        super(cat);
    }

    @Override
    public void printAltAccesoriu() {
        System.out.println("Pretul acestei masini este intre 5000Euro - 12.000Euro");
    }
}

