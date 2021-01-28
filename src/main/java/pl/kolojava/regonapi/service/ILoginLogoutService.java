package pl.kolojava.regonapi.service;

public interface ILoginLogoutService {

    String login();
    Boolean logout(String sid);

}
