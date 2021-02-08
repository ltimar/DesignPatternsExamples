package Test2_V5_ChainOfResposabilities;

import java.util.ArrayList;

public class GoogleAuthentication extends ExternAuthenticationDecorator{
    GoogleDB googleDB = new GoogleDB();

    public GoogleAuthentication(AuthenticationHandler authenticationHandler) {
        super(authenticationHandler);
    }

    @Override
    public String getTokenExtern(String username, String password) throws InvalidCredentialException {
        ArrayList<Token> tokenList = new ArrayList<>();
        tokenList = googleDB.returnDB();
        for ( Token crt : tokenList){
            if (crt.getNume().equals(username) && crt.getParola().equals(password)){
                return "user  "+ crt.getNume() +" autentificat prin Google";
            }
        }
        throw new InvalidCredentialException();
    }
}
