package Test2_V6_SensoriObserver;

import java.util.ArrayList;
import java.util.List;

public class MotionSensor2 extends GeneralSensor {
    public MotionSensor2(String nume) {
        super(nume);
    }

    @Override
    public void declanseazaAlarma() {
        System.out.println("Motion sensor a detectat miscare");
        notifyAllObservers();
    }
}
