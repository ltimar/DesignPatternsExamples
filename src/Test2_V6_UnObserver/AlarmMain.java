package Test2_V6_UnObserver;

public class AlarmMain {
    public static void main(String args[]){
        SursaMotionSensor motionSensor = new SursaMotionSensor();

        SirenaCasa sirena = new SirenaCasa(motionSensor);
        Proprietar client = new Proprietar(motionSensor);

        motionSensor.declanseazaAlarma();
    }


}
