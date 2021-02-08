package Test2_V6_PrototypeSmoothieMaker;

import java.util.Hashtable;

public class FruitPrototypeManager {
    private static Hashtable<String, Fruct> cosulCuFructe = new Hashtable<>();

    public static Fruct oferaFruct(String fructDescription){
        Fruct clonaFruct = cosulCuFructe.get(fructDescription);
        return (Fruct) clonaFruct.clone();
    }

    public static void loadCacheFructeDinDB(){
        Kiwi kiwi = new Kiwi();
        kiwi.setIdFruct("kiwi de Spania");
        cosulCuFructe.put(kiwi.getIdFruct(), kiwi);

        Strawberry capsune = new Strawberry();
        capsune.setIdFruct("capsune de Periam");
        cosulCuFructe.put(capsune.getIdFruct(), capsune);
    }
}
