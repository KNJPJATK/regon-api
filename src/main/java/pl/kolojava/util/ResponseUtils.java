package pl.kolojava.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ResponseUtils {

    private ResponseUtils() {}

    public static <T> T mapResponse(InputStream response, Class<T> dstClass) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance("pl.kolojava.dataset");
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return (T) unmarshaller.unmarshal(response);
    }

    public static <T> T mapResponse(String response, Class<T> dstClass) throws JAXBException {
        if (response == null || response.isEmpty()) {
            return null;
        }
        InputStream is = new ByteArrayInputStream(response.getBytes(StandardCharsets.UTF_8));
        return mapResponse(is, dstClass);
    }

}
