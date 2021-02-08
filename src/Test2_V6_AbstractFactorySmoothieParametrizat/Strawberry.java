package Test2_V6_AbstractFactorySmoothieParametrizat;

public class Strawberry implements Fruit{
//    @Override
//    public String getFruitName() {
//        return "strawberry";
//    }

    @Override
    public FruitEnum getFruitName() {
        return FruitEnum.STRAWBERRY;
    }
}
