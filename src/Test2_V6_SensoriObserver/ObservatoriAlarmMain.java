package Test2_V6_SensoriObserver;

public class ObservatoriAlarmMain {
    public static void main(String args[]){
        // in aceasta aplicatie sunt mai multe "surse"
        GeneralSensor motionSensor = new MotionSensor2("sensor de miscare");
        GeneralSensor contactSensor1 = new ContactSensor2("contact senzor 1");
        GeneralSensor contactSensor2 = new ContactSensor2("contact senzor 2");
        GeneralSensor contactSensor3 = new ContactSensor2("contact senzor 3");

        // acestia sunt observer-ii
        SirenaObserver sirena = new SirenaObserver();
        ProprietarObserver client = new ProprietarObserver();

        motionSensor.attach(sirena);
        motionSensor.declanseazaAlarma();

        System.out.println("-----------------------");
        contactSensor2.attach(sirena);
        contactSensor2.attach(client);
        contactSensor2.declanseazaAlarma();

    }
}
