package Test2_V6_UnObserver;

public class Proprietar extends Observer {

    public Proprietar(SursaMotionSensor sensorAlarma) {
        this.AlarmSensor = sensorAlarma;
        this.AlarmSensor.attach(this);
    }

    @Override
    public void notifyAlarma() {
        System.out.println("Atentie: sensorul de miscare a declansat alarma");
    }
}