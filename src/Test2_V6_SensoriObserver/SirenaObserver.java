package Test2_V6_SensoriObserver;

import java.util.ArrayList;
import java.util.Arrays;

public class SirenaObserver implements Observer{

    @Override
    public void notifyAlarma(GeneralSensor sursa) {
        System.out.println("Alarma casei a pornit : sunnnna !! datorita "+sursa.getNumeSensor());
    }
}
