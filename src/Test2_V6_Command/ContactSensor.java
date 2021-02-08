package Test2_V6_Command;

public class ContactSensor implements Sensor{
    Comanda comandaPeCareOExecuta;

    public ContactSensor(Comanda doCmd){
        this.comandaPeCareOExecuta = doCmd;
    }
    @Override
    public void detecteaza() {
        comandaPeCareOExecuta.declanseaza();
    }
}


