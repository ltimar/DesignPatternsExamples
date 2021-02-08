package Test2_V6_Command;

public class Client implements SursaNotificare{
    String nume;
    String prenume;
    String nrTelefon;

    public Client(String nume, String prenume, String nrTelefon) {
        this.nume = nume;
        this.prenume = prenume;
        this.nrTelefon = nrTelefon;
    }

    public Client(String numar) {
        this.nrTelefon = numar;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    void notificareTelefon(String senzorName){
        System.out.println("Atentie: "+senzorName + " s-a declansat acasa");
    }
}
