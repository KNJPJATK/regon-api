package pl.kolojava.regonapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.kolojava.dataset.DaneSzukajPodmioty;
import pl.kolojava.regonapi.service.ILoginLogoutService;
import pl.kolojava.regonapi.service.IReportService;
import pl.kolojava.util.ResponseUtils;

import javax.xml.bind.JAXBException;

@RestController
public class MyController {

    private final ILoginLogoutService loginLogoutService;
    private final IReportService reportService;

    @Autowired
    public MyController(
            ILoginLogoutService loginLogoutService,
            IReportService reportService
    ) {
        this.loginLogoutService = loginLogoutService;
        this.reportService = reportService;
    }

    @GetMapping("/regon/{regon}")
    public @ResponseBody DaneSzukajPodmioty.Dane getBaseReportBasicOnREGON(@PathVariable String regon) throws JAXBException {
        String kluczSesji = loginLogoutService.login();
        String report = reportService.getBaseReportBasicOnREGON(kluczSesji, regon);
        loginLogoutService.logout(kluczSesji);
        DaneSzukajPodmioty daneSzukajPodmioty = ResponseUtils.mapResponse(report, DaneSzukajPodmioty.class);
        if (daneSzukajPodmioty != null) {
            return daneSzukajPodmioty.getDane().get(0);
        }
        return null;
    }

}
