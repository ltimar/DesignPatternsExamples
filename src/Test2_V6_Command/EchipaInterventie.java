package Test2_V6_Command;

public class EchipaInterventie implements SursaNotificare{
    String echipa;
    //String eMail;

    public EchipaInterventie(String nrEchipa){
        this.echipa = nrEchipa;
    }

    void notificareEchipa(String clientNr){
        System.out.println("Atentie: s-a declansat alarma la clinetul "+clientNr);
    }
}
