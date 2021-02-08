package Test2_V5_CompositeAuthentificator;

import Test2_V5_ChainOfResposabilities.InvalidCredentialException;

public interface IAuthenticationHandler {
    public String getToken(String username, String password) throws InvalidCredentialException;
}
