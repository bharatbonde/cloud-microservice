package bharat.rest.endpoints;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MS2 {
    private static final Logger log = LoggerFactory.getLogger(MS2.class);
    @RequestMapping("/v1/ms2")
    public Starter operation(@RequestParam(value = "name", defaultValue = "Bharat") String nameVar) {
        log.info("IN MS2");
        return new Starter(null, null, nameVar);
    }
}
