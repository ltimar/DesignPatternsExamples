package Test2_V6_Command;

public class ComandaNotificareTelefon implements Comanda{
    private Client client;
    private String sensor;

    public ComandaNotificareTelefon(Client _client, String  sensorName){
        this.client = _client;
        this.sensor = sensorName;
    }

    @Override
    public void declanseaza() {
        client.notificareTelefon(sensor);
    }
}
