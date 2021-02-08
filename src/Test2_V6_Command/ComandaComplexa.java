package Test2_V6_Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComandaComplexa implements Comanda{
    private List<Comanda> listaComenzi = new ArrayList<>();

    public ComandaComplexa(Comanda ...comenzi){
        listaComenzi.addAll(Arrays.asList(comenzi));
    }

    public void addCmd(Comanda cmd){
        listaComenzi.add(cmd);
    }

    @Override
    public void declanseaza() {
        listaComenzi.forEach(crtCmd -> crtCmd.declanseaza());
    }
}
