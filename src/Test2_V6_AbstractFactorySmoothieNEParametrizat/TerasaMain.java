package Test2_V6_AbstractFactorySmoothieNEParametrizat;

public class TerasaMain {
    public static void main(String args[]){
        FabricaDeFructe fabrica = new FabricaDeStrawberry();

        SmoothieMaker smoothieMaker = new SmoothieMaker(fabrica);
        smoothieMaker.makeSmoothie();

        System.out.println("ddddddddddddddddd");
        smoothieMaker.setFabrica(new FabricaDeKiwi());
        smoothieMaker.makeSmoothie();
    }
}
