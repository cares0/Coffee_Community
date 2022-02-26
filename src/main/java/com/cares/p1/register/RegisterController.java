package com.cares.p1.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/register/**")
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public void join() throws Exception {
	}
	
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String join(RegisterDTO registerDTO, Model model) throws Exception {
		int result = registerService.join(registerDTO);		
		return "redirect:../"; // 이거 틀림, 확인할것!
	}	
}
