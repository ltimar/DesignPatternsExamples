package Test2_V5_ChainOfResposabilities;

public abstract class ExternAuthenticationDecorator  implements AuthenticationHandler{
    private AuthenticationHandler authSuplimentara;

    public ExternAuthenticationDecorator(AuthenticationHandler gg){
            this.authSuplimentara = gg;
    }

    @Override
    public String getToken(String username, String password) throws InvalidCredentialException {
        String auth;
        try {
                auth = authSuplimentara.getToken(username, password);
        } catch (InvalidCredentialException expp) {
            auth = getTokenExtern(username, password);
        }
        return auth;
    }

    public abstract String getTokenExtern(String username, String password) throws InvalidCredentialException;
}
