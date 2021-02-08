package Test2_V6_PrototypeSmoothieMaker;

import Test2_V6_SensoriObserver.Observer;

public abstract class Fruct implements Cloneable{
    private String idFruct;
    private String type;

    public String getIdFruct() {
        return idFruct;
    }

    public void setIdFruct(String idFruct) {
        this.idFruct = idFruct;
    }

    public Object clone() {
        Object clona = null;

        try {
            // shallow copy
            clona = super.clone();
        } catch (CloneNotSupportedException exceptie) {
            exceptie.printStackTrace();
        }
        return clona;
    }
}
