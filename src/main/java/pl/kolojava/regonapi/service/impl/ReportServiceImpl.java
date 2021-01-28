package pl.kolojava.regonapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.WebServiceMessageFactory;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import pl.kolojava.model.DaneSzukajPodmioty;
import pl.kolojava.model.DaneSzukajPodmiotyResponse;
import pl.kolojava.model.ObjectFactory;
import pl.kolojava.model.ParametryWyszukiwania;
import pl.kolojava.regonapi.service.IReportService;
import pl.kolojava.regonapi.service.impl.callback.BIRHeadersCallback;

@Service
public class ReportServiceImpl
        extends WebServiceGatewaySupport
        implements IReportService {

    private final ObjectFactory objectFactory = new ObjectFactory();

    public ReportServiceImpl(
            @Value("${bir.url}") String birUrl,
            @Autowired WebServiceMessageFactory messageFactory,
            @Autowired Marshaller marshaller,
            @Autowired Unmarshaller unmarshaller
    ) {
        super();
        setDefaultUri(birUrl);
        setMessageFactory(messageFactory);
        setMarshaller(marshaller);
        setUnmarshaller(unmarshaller);
    }

    @Override
    public String getBaseReportBasicOnREGON(String sid, String regon) {
        ParametryWyszukiwania parametryWyszukiwania = objectFactory.createParametryWyszukiwania();
        parametryWyszukiwania.setRegon(objectFactory.createParametryWyszukiwaniaRegon(regon));
        DaneSzukajPodmioty daneSzukajPodmioty = objectFactory.createDaneSzukajPodmioty();
        daneSzukajPodmioty.setPParametryWyszukiwania(objectFactory.createDaneSzukajPodmiotyPParametryWyszukiwania(parametryWyszukiwania));

        WebServiceMessageCallback callback = new BIRHeadersCallback(getDefaultUri(), "DaneSzukajPodmioty", sid);
        DaneSzukajPodmiotyResponse response = (DaneSzukajPodmiotyResponse) getWebServiceTemplate()
                .marshalSendAndReceive(daneSzukajPodmioty, callback);

        return response.getDaneSzukajPodmiotyResult().getValue();
    }

}
