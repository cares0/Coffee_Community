package com.cares.p1.favorite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/favorite/**")
public class FavoriteController {

	@Autowired
	private FavoriteService favoriteService;
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public void add() throws Exception {
		
		
	}
}
