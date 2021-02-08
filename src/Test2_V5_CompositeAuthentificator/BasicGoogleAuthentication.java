package Test2_V5_CompositeAuthentificator;

import java.util.ArrayList;

public class BasicGoogleAuthentication implements IAuthenticationHandler{
    private boolean esteAuthentificat;
    CompGoogleDB googleDB = new CompGoogleDB();

    public BasicGoogleAuthentication(){
        this.esteAuthentificat = false;
    }

    @Override
    public String getToken(String username, String password) {
        ArrayList<CompToken> tokenList = new ArrayList<>();
        tokenList = googleDB.returnDB();
        for ( CompToken crt : tokenList){
            if (crt.getNume().equals(username) && crt.getParola().equals(password))
                return "user "+ crt.getNume() +" autentificat prin cont Google";
        }
        throw new CompInvalidCredentialException();
    }
}
