package Test2_V5_CompositeAuthentificator;

public class CompToken {
    String nume;
    String parola;

    public CompToken(String nume, String par) {
        this.nume = nume;
        this.parola = par;
    }

    public String getNume() {
        return this.nume;
    }

    public String getParola() {
        return parola;
    }
}

