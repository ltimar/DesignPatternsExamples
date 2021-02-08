package Test2_V1_Decorator;

public class DecoratorPoza extends BrosuraDecorata {

    public DecoratorPoza(Brosura cat) {
        super(cat);
    }

    @Override
    public void printAltAccesoriu() {
        System.out.println("Aceasta este poza de profil");
    }
}
