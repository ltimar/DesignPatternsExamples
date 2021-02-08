package Test2_V5_ChainOfResposabilities;

import java.util.ArrayList;

public class UsernamePasswordAuth implements AuthenticationHandler{
    ApplicationDB localDB = new ApplicationDB();

    @Override
    public String getToken(String username, String password) {
        ArrayList<Token> tokenList = new ArrayList<>();
        tokenList = localDB.returnDB();
        for ( Token crt : tokenList){
            if (crt.getNume().equals(username) && crt.getParola().equals(password))
                return "user "+ crt.getNume() +" autentificat prin username / parola";
        }
        throw new InvalidCredentialException();
    }
}
