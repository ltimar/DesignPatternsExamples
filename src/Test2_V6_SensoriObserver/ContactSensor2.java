package Test2_V6_SensoriObserver;

import java.util.ArrayList;

public class ContactSensor2 extends GeneralSensor{
    public ContactSensor2(String nume) {
        super(nume);
    }

    @Override
    public void declanseazaAlarma() {
        System.out.println("Contact sensor a detectat miscare");
        notifyAllObservers();
    }
}
