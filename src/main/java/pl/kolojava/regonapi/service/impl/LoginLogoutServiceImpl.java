package pl.kolojava.regonapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.WebServiceMessageFactory;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import pl.kolojava.model.*;
import pl.kolojava.regonapi.service.ILoginLogoutService;
import pl.kolojava.regonapi.service.impl.callback.BIRHeadersCallback;

@Service
public class LoginLogoutServiceImpl
        extends WebServiceGatewaySupport
        implements ILoginLogoutService {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final String birKey;

    public LoginLogoutServiceImpl(
            @Value("${bir.key}") String birKey,
            @Value("${bir.url}") String birUrl,
            @Autowired WebServiceMessageFactory messageFactory,
            @Autowired Marshaller marshaller,
            @Autowired Unmarshaller unmarshaller
    ) {
        super();
        this.birKey = birKey;
        setDefaultUri(birUrl);
        setMessageFactory(messageFactory);
        setMarshaller(marshaller);
        setUnmarshaller(unmarshaller);
    }

    @Override
    public String login() {
        Zaloguj zaloguj = objectFactory.createZaloguj();
        zaloguj.setPKluczUzytkownika(objectFactory.createZalogujPKluczUzytkownika(birKey));

        WebServiceMessageCallback callback = new BIRHeadersCallback(getDefaultUri(), "Zaloguj");
        ZalogujResponse response = (ZalogujResponse) getWebServiceTemplate()
                .marshalSendAndReceive(zaloguj, callback);

        return response.getZalogujResult().getValue();
    }

    @Override
    public Boolean logout(String sid) {
        Wyloguj wyloguj = objectFactory.createWyloguj();
        wyloguj.setPIdentyfikatorSesji(objectFactory.createWylogujPIdentyfikatorSesji(sid));

        WebServiceMessageCallback callback = new BIRHeadersCallback(getDefaultUri(), "Wyloguj", sid);
        WylogujResponse response = (WylogujResponse) getWebServiceTemplate()
                .marshalSendAndReceive(wyloguj, callback);

        return response.isWylogujResult();
    }
}
