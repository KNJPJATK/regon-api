package pl.kolojava.regonapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.WebServiceMessageFactory;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;

@Configuration
public class MyConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("pl.kolojava.model");
        return marshaller;
    }

    @Bean
    public WebServiceMessageFactory messageFactory() throws SOAPException {
        MessageFactory messageFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
        SaajSoapMessageFactory saajSoapMessageFactory = new SaajSoapMessageFactory(messageFactory);
        return saajSoapMessageFactory;
    }

}
