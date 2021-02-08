package Test2_V5_ChainOfResposabilities;

import java.util.ArrayList;

public class GithubAuthentication extends ExternAuthenticationDecorator{
    GitHubDB gitDB = new GitHubDB();

    public GithubAuthentication(AuthenticationHandler  _authenticationHandler) {
        super(_authenticationHandler);
    }

    @Override
    public String getTokenExtern(String username, String password) throws InvalidCredentialException {
        ArrayList<Token> tokenList = new ArrayList<>();
        tokenList = gitDB.returnDB();
        for ( Token crt : tokenList){
            if (crt.getNume().equals(username) && crt.getParola().equals(password))
                return "user "+ crt.getNume() + " autentificat prin GitHub";
        }
        throw new InvalidCredentialException();
    }
}
