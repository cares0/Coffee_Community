package com.cares.p1.favorite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cares.p1.cupnote.CupnoteDTO;
import com.cares.p1.flavor.FlavorDTO;
import com.cares.p1.register.RegisterDTO;
import com.cares.p1.rpoint.RPointDTO;

@Controller
@RequestMapping(value = "/favorite/**")
public class FavoriteController {

	@Autowired
	private FavoriteService favoriteService;
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public void add(RegisterDTO registerDTO, Model model) throws Exception {
		FavoriteDTO favoriteDTO = favoriteService.searchFavorNums(registerDTO);
		model.addAttribute("favorNums", favoriteDTO);
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(CupnoteDTO cupnoteDTO, RPointDTO rPointDTO, FlavorDTO flavorDTO) throws Exception {
		favoriteService.addFavorite(cupnoteDTO, rPointDTO, flavorDTO);
		return "redirect:../";
	}
}
