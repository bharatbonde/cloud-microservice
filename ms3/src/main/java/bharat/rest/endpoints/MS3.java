package bharat.rest.endpoints;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
    public class MS3 {
        private static final Logger log = LoggerFactory.getLogger(MS3.class);

        @Autowired
        RestTemplate restTemplate;

        @RequestMapping("/v1/ms3")
        public void operation(@RequestParam(value = "name", defaultValue = "Bharat") String nameVar) {
            log.info("Orchestration service - Calling MS1");
            Starter st1 = restTemplate.getForObject("http://localhost:8080/v1/starter2", Starter.class);
            log.info("ms1 response "+st1.getName());
            Starter st2 = restTemplate.getForObject("http://localhost:8081/v1/ms2", Starter.class);
            log.info("ms2 response "+st2.getName());


        }
    }

