package it.digitalnucleus.rand;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	private final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/log", method = RequestMethod.GET)
    public String index(){
        logger.trace("trace logging");
        logger.debug("debug logging");
        logger.info("info logging");
        logger.warn("warning logging");
        //logger.error("error logging", new RuntimeException("help"));
        
        return "Service Executed";
    }

}
