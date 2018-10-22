package bharat.rest.endpoints;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MS2 {
    private static final Logger log = LoggerFactory.getLogger(MS2.class);

    @Value("${test.property:Hello default}")
    private String message;

    @RequestMapping("/v1/ms2")
    public Starter operation(@RequestParam(value = "name", defaultValue = "Bharat") String nameVar) {
        log.info("IN MS2");
        return new Starter(message, null, nameVar);
    }
}
