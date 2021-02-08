package Test2_V5_ChainOfResposabilities;

public class SmartWalletMain {
    public static void main(String args[]){
        Authenticator lantAutentificare = new Authenticator();

        lantAutentificare.autentifica("Dobrici","bau352");
        lantAutentificare.autentifica("Popescu","222Beta");
    }
}
