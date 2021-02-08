package Test2_V6_Command;

public class ComandaDeclansareSirena implements Comanda{
    Sirena sirenaCasei;

    public ComandaDeclansareSirena(Sirena sirena){
        this.sirenaCasei = sirena;
    }
    @Override
    public void declanseaza() {
        sirenaCasei.declansareSirena();
    }
}
