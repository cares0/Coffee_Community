package com.cares.p1.favorite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cares.p1.register.RegisterDTO;

@Controller
@RequestMapping(value = "/favorite/**")
public class FavoriteController {

	@Autowired
	private FavoriteService favoriteService;
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public void add(RegisterDTO registerDTO, Model model) throws Exception {
		model.addAttribute("register", registerDTO);
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(RegisterDTO registerDTO, FavoriteDTO favoriteDTO) throws Exception {
		int result = favoriteService.add(favoriteDTO, registerDTO);
		
		return "redirect:../";
	}
	
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public void update(FavoriteDTO favoriteDTO, Model model) throws Exception {
		model.addAttribute("favoriteDTO", favoriteDTO);
	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(FavoriteDTO favoriteDTO) throws Exception {
		int result = favoriteService.update(favoriteDTO);
		
		return "redirect: ../register/mypage";
	}
}
