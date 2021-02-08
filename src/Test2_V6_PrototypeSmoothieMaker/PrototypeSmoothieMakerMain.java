package Test2_V6_PrototypeSmoothieMaker;

import Test2_V6_AbstractFactorySmoothieParametrizat.Fruit;

public class PrototypeSmoothieMakerMain {
    public static void main(String args[]){
        FruitPrototypeManager.loadCacheFructeDinDB();
        Fruct strawberry = FruitPrototypeManager.oferaFruct("capsune de Periam");
        makeSmoothie(strawberry);

        System.out.println("######################");
        Fruct kiwi =  FruitPrototypeManager.oferaFruct("kiwi de Spania");
        makeSmoothie(kiwi);
    }

    public static PrototypeSmoothie makeSmoothie(Fruct fruit) {
        try {
            //Fruct fruit = fabrica.oferaFruct(fruct);
            prepareFruit(fruit);
            blendFruit(fruit);
            PrototypeSmoothie smoothie = serveSmoothie();
            return smoothie;
        }catch (Exception ee){
            ee.printStackTrace();
        }
        return null;
    }

    static void prepareFruit(Fruct fruit){
        System.out.println("Preparare fruct "+fruit.getIdFruct());
    }

    static void blendFruit(Fruct fruit){
        System.out.println("Blend fruct "+fruit.getIdFruct());
    }

    static public PrototypeSmoothie serveSmoothie(){
        return new PrototypeSmoothie();
    }
}
