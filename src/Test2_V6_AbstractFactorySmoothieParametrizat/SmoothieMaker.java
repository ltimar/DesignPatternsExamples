package Test2_V6_AbstractFactorySmoothieParametrizat;

public class SmoothieMaker {
    FabricaDeFructe fabrica;

    public SmoothieMaker(FabricaDeFructe fff){
        this.fabrica = fff;
    }

    public Smoothie makeSmoothie(FruitEnum fruct) {
        try {
            Fruit fruit = fabrica.oferaFruct(fruct);
            prepareFruit(fruit);
            blendFruit(fruit);
            Smoothie smoothie = serveSmoothie();
            return smoothie;
        }catch (Exception ee){
            ee.printStackTrace();
        }
        return null;
    }
//    public Smoothie makeSmoothie(String fruct) {
//        try {
//            Fruit fruit = fabrica.oferaFruct(fruct);
//            prepareFruit(fruit);
//            blendFruit(fruit);
//            Smoothie smoothie = serveSmoothie();
//            return smoothie;
//        }catch (Exception ee){
//            ee.printStackTrace();
//        }
//        return null;
//    }

    void prepareFruit(Fruit fruit){
        System.out.println("Preparare fruct "+fruit.getFruitName());
    }

    void blendFruit(Fruit fruit){
        System.out.println("Blend fruct "+fruit.getFruitName());
    }

    public Smoothie serveSmoothie(){
        return new Smoothie();
    }
}
