package Test2_V5_ChainOfResposabilities;

public class Authenticator {
    AuthenticationHandler tokenAutentificare;

    public Authenticator(){
        creazaLant();
    }

    private void creazaLant(){
        tokenAutentificare = new GithubAuthentication( new GoogleAuthentication (new UsernamePasswordAuth())) ;
    }

    public void autentifica(String nume, String parola){
        System.out.println(tokenAutentificare.getToken(nume,parola));
    }
}
