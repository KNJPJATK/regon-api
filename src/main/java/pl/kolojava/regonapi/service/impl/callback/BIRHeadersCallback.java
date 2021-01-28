package pl.kolojava.regonapi.service.impl.callback;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapHeaderElement;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

import javax.xml.namespace.QName;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class BIRHeadersCallback implements WebServiceMessageCallback {

    private final String to;
    private final String action;
    private final String sid;

    public BIRHeadersCallback(String to, String action) {
        this(to, action, null);
    }

    public BIRHeadersCallback(String to, String action, String sid) {
        this.to = to;
        this.action = action;
        this.sid = sid;
    }

    @Override
    public void doWithMessage(WebServiceMessage webServiceMessage) throws IOException, TransformerException {
        if (webServiceMessage instanceof SaajSoapMessage) {
            SaajSoapMessage message = (SaajSoapMessage) webServiceMessage;

            if (sid != null) {
                message.getSaajMessage().getMimeHeaders().addHeader("sid", sid);
            }

            SoapHeader header = message.getSoapHeader();
            header.addNamespaceDeclaration("wsa", "http://www.w3.org/2005/08/addressing");
            SoapHeaderElement toElement = header.addHeaderElement(new QName("http://www.w3.org/2005/08/addressing", "To", "wsa"));
            SoapHeaderElement actionElement = header.addHeaderElement(new QName("http://www.w3.org/2005/08/addressing", "Action", "wsa"));
            toElement.setText(to);
            actionElement.setText("http://CIS/BIR/PUBL/2014/07/IUslugaBIRzewnPubl/" + action);
        }
        webServiceMessage.writeTo(System.out);
        System.out.println();
    }

}
