package Test2_V6_UnObserver;

import java.util.ArrayList;
import java.util.List;

public class SursaMotionSensor implements ISensor {
    private List<Observer> listaObservatori = new ArrayList<>();

    public void attach(Observer observer){
        listaObservatori.add(observer);
    }

    public void notifyAllObservers(){
        listaObservatori.forEach(obs -> obs.notifyAlarma());
    }

    @Override
    public void declanseazaAlarma() {
        notifyAllObservers();
    }
}
