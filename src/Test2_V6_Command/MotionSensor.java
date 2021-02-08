package Test2_V6_Command;

public class MotionSensor implements Sensor{
    Comanda comandaPeCareOExecuta;

    public MotionSensor(Comanda doCmd){
        this.comandaPeCareOExecuta = doCmd;
    }
    @Override
    public void detecteaza() {
        comandaPeCareOExecuta.declanseaza();
    }
}
