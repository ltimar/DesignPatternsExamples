package Test2_V5_CompositeAuthentificator;

import Test2_V4_CompositeCronJobs.CompositeCronJob;
import Test2_V4_CompositeCronJobs.CronJob;
import Test2_V4_CompositeCronJobs.SimpleCronJob;
import Test2_V5_ChainOfResposabilities.AuthenticationHandler;
import Test2_V5_ChainOfResposabilities.GithubAuthentication;
import Test2_V5_ChainOfResposabilities.GoogleAuthentication;
import Test2_V5_ChainOfResposabilities.UsernamePasswordAuth;

public class AuthentificationMain {
    public static void main(String args[]){
        IAuthenticationHandler basicAuth = new BasicUserPassAuthentification();
        //System.out.println(basicAuth.getToken("Fabrizio","328Cellos"));

        IAuthenticationHandler googleAuth = new BasicGoogleAuthentication();
        IAuthenticationHandler authCompusa = new CompositeAuthentication(googleAuth, basicAuth);
        //String rez = authCompusa.getToken("Fabrizio","328Cellos");
        String rez = authCompusa.getToken("Ilie", "alpha123");
        System.out.println(rez);
        //System.out.println(authCompusa.getToken("Fabrizio","328Cellos"));
    }
}
