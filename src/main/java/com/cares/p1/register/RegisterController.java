package com.cares.p1.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/register/**")
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	
	@RequestMapping(value = "join", method=RequestMethod.GET)
	public void join() throws Exception {
		
	}
	
	
}
