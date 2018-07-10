package com.docplexus.token;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@Controller
public class DocplexusTokenApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocplexusTokenApplication.class, args);
	}
	
	
	
	@RequestMapping(value="/", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        return "welcome";
    }
	
}
