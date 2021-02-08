package Test2_V6_SensoriObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class GeneralSensor {
    private String numeSensor;
    public GeneralSensor(String nume){
        this.numeSensor = nume;
    }

    public String getNumeSensor() {
        return numeSensor;
    }
    private List<Observer> listaObservatori = new ArrayList<>();

    public void attach(Observer observer){
        listaObservatori.add(observer);
    }

    public void notifyAllObservers(){
        listaObservatori.forEach(obs -> obs.notifyAlarma(this));
    }
    public abstract void declanseazaAlarma();
}
