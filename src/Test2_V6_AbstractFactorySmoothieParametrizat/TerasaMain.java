package Test2_V6_AbstractFactorySmoothieParametrizat;

public class TerasaMain {
    public static void main(String args[]){
        FabricaDeFructe fabrica = new FabricaDeFructe();

        SmoothieMaker smoothieMaker = new SmoothieMaker(fabrica);
        smoothieMaker.makeSmoothie(FruitEnum.KIWI);
        smoothieMaker.makeSmoothie(FruitEnum.STRAWBERRY);
    }
}
