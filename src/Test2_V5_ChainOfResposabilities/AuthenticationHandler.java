package Test2_V5_ChainOfResposabilities;

public interface AuthenticationHandler {
    public abstract String getToken(String username, String password) throws InvalidCredentialException;

}
