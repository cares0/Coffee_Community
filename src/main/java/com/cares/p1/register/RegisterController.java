package com.cares.p1.register;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public void login() throws Exception {
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(HttpSession session,RegisterDTO registerDTO, String remember, HttpServletResponse response) throws Exception {
		
		if(remember != null && remember.equals("1")) {
			Cookie cookie = new Cookie("remember", registerDTO.getId());
			response.addCookie(cookie);
		} else {
			Cookie cookie = new Cookie("remember", "");
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		}
		registerDTO = registerService.login(registerDTO);
		String path = "redirect:./login";
		if(registerDTO != null) {
			session.setAttribute("member", registerDTO);
			path = "redirect:../";
		}
		return path;
	}
	
	@RequestMapping(value = "mypage", method = RequestMethod.GET)
	public void mypage(HttpSession session, Model model) throws Exception {
		
		RegisterDTO registerDTO = (RegisterDTO) session.getAttribute("member");
		registerDTO = registerService.mypage(registerDTO);
		model.addAttribute("dto", registerDTO);
	}
	
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception {
		session.invalidate();
		return "redirect:../";
	}
	
}
