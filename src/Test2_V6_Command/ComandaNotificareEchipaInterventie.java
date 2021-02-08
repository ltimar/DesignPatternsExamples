package Test2_V6_Command;

public class ComandaNotificareEchipaInterventie implements Comanda{
    EchipaInterventie echipa;
    Client client;

    public ComandaNotificareEchipaInterventie(EchipaInterventie ei, Client client){
        this.echipa = ei;
        this.client = client;
    }
    @Override
    public void declanseaza() {
            echipa.notificareEchipa(client.getNrTelefon());
    }
}
