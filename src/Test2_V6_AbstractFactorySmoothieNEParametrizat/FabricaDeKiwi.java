package Test2_V6_AbstractFactorySmoothieNEParametrizat;

public class FabricaDeKiwi implements FabricaDeFructe{
    @Override
    public IFruit createFruct() {
        return new Kiwi();
    }
}
