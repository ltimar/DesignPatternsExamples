package Test2_V6_UnObserver;

public class SirenaCasa extends Observer{
    public SirenaCasa(SursaMotionSensor sensorAlarma){
        this.AlarmSensor = sensorAlarma;
        this.AlarmSensor.attach(this);
    }
    @Override
    public void notifyAlarma() {
        System.out.println("Alarma casei a pornit : sunnnna !!");
    }
}
