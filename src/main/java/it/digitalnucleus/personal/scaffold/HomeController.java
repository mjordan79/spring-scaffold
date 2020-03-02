package it.digitalnucleus.personal.scaffold;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	private final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	//@RequestMapping(value = "/log", method = RequestMethod.GET)
    @GetMapping(value = "/log")
	public @ResponseBody String index() {
        logger.trace("trace logging");
        logger.debug("debug logging");
        logger.info("info logging");
        logger.warn("warning logging");
        return "Hello, World!";
    }

}
