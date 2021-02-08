package Test2_V6_Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlarmaMain {
    static Sirena sirenaCasa = new Sirena();
    static Client proprietar = new Client("Alin","Florescu","0758 22 33 44");
    static EchipaInterventie echipaZenGuard = new EchipaInterventie("933");

    public static void main(String args[]) {
    Sensor MotionSensor = new MotionSensor(new ComandaDeclansareSirena(sirenaCasa));
        MotionSensor.detecteaza();

        Sensor SenzorContact1 = new ContactSensor(new ComandaDeclansareSirena(sirenaCasa));
        SenzorContact1.detecteaza();


        Sensor SenzorContact2 = new ContactSensor(new ComandaNotificareTelefon(proprietar, "SenzorContact 2"));
        SenzorContact2.detecteaza();

        System.out.println("-------------------------");
        ComandaComplexa douaComenzi = new ComandaComplexa(new ComandaDeclansareSirena(sirenaCasa),
                new ComandaNotificareTelefon(proprietar, "SenzorContact 3"));
        Sensor SenzorContact3 = new ContactSensor(douaComenzi);
        SenzorContact3.detecteaza();


        // extindere
        // GasSenzor - aplicatia este open-close ptr noi senzori
        // Sensor GasSenzor = new

        // Tiparul command permite o ordine in declansarea actiunilor

        // Notificarea echipei de interventie -> crearea unei noi clase de comanda: ComandaNotificareEchipaInterventie
        // si a unei noi clase EchipaInterventie
    }
}
