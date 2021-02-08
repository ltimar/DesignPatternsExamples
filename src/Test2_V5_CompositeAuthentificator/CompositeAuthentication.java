package Test2_V5_CompositeAuthentificator;

import Test2_V4_CompositeCronJobs.Context;
import Test2_V4_CompositeCronJobs.CronJob;
import Test2_V5_ChainOfResposabilities.InvalidCredentialException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeAuthentication implements IAuthenticationHandler {
    private List<IAuthenticationHandler> listaDeAutentificari = new ArrayList<>();

    public CompositeAuthentication(IAuthenticationHandler ...handlerList){
        listaDeAutentificari.addAll(Arrays.asList(handlerList));
    }

    @Override
    public String getToken(String username, String password) throws InvalidCredentialException {
        for (IAuthenticationHandler auth : listaDeAutentificari) {
           return auth.getToken(username, password);
        }
        //throw new InvalidCredentialException();
        return null;
    }
}
