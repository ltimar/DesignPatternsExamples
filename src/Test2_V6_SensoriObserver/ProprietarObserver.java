package Test2_V6_SensoriObserver;

public class ProprietarObserver implements Observer {
    @Override
    public void notifyAlarma(GeneralSensor sursa) {
        System.out.println("Atentie: sensorul "+ sursa.getNumeSensor()+ " de miscare a declansat alarma");
    }
}