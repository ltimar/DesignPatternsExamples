package Test2_V6_AbstractFactorySmoothieNEParametrizat;

public class FabricaDeStrawberry implements FabricaDeFructe{
    @Override
    public IFruit createFruct() {
        return new Strawberry();
    }
}
