package Test2_V6_AbstractFactorySmoothieParametrizat;
public class Kiwi implements Fruit {
    @Override
    //public String getFruitName() {
//        return "kiwi";
//    }

    public FruitEnum getFruitName() {
        return FruitEnum.KIWI;
    }
}
