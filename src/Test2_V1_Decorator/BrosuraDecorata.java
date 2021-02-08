package Test2_V1_Decorator;

public abstract class BrosuraDecorata implements Brosura {
    private final Brosura catalog;

    protected BrosuraDecorata(Brosura cat){
        this.catalog = cat;
    }

    public abstract void printAltAccesoriu();

    @Override
    public void printBrosura() {
        printAltAccesoriu();
        this.catalog.printBrosura();
    }
}
