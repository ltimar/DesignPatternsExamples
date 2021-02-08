package Test2_V5_CompositeAuthentificator;

import java.util.ArrayList;

public class BasicUserPassAuthentification implements IAuthenticationHandler{
    private boolean esteAuthentificat;
    CompApplicationDB localDB = new CompApplicationDB();


    public BasicUserPassAuthentification(){
        this.esteAuthentificat = false;
    }

    @Override
    public String getToken(String username, String password) {
        ArrayList<CompToken> tokenList = new ArrayList<>();
        tokenList = localDB.returnDB();
        for ( CompToken crt : tokenList){
            if (crt.getNume().equals(username) && crt.getParola().equals(password))
                return "user "+ crt.getNume() +" autentificat prin username / parola";
        }
        throw new CompInvalidCredentialException();
    }
}
