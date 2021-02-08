package Test2_V6_AbstractFactorySmoothieNEParametrizat;

public class SmoothieMaker {
    FabricaDeFructe fabrica;
    public SmoothieMaker(FabricaDeFructe fff){
        this.fabrica = fff;
    }

    public void setFabrica(FabricaDeFructe differentFabrica) {
        this.fabrica = differentFabrica;
    }

    public Smoothie makeSmoothie() {
            IFruit fruit = fabrica.createFruct();
            prepareFruit(fruit);
            blendFruit(fruit);
            Smoothie smoothie = serveSmoothie();
            return smoothie;

    }

    void prepareFruit(IFruit fruit){
        System.out.println("Preparare fruct "+fruit.getFruitName());
    }

    void blendFruit(IFruit fruit){
        System.out.println("Blend fruct "+fruit.getFruitName());
    }

    public Smoothie serveSmoothie(){
        return new Smoothie();
    }
}
