package com.cares.p1.favorite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cares.p1.cupnote.CupnoteDTO;
import com.cares.p1.flavor.FlavorDTO;
import com.cares.p1.register.RegisterDTO;
import com.cares.p1.rpoint.RPointDTO;

@Service
public class FavoriteService {

	@Autowired
	private FavoriteDAO favoriteDAO;
	
	public FavoriteDTO searchFavorNums(RegisterDTO registerDTO) throws Exception {
		registerDTO = favoriteDAO.searchNum(registerDTO);
		int result = favoriteDAO.addFavorite(registerDTO);
		FavoriteDTO favoriteDTO = favoriteDAO.searchFavorNums(registerDTO);
		
		return favoriteDTO;
	}
	
	public void addFavorite(CupnoteDTO cupnoteDTO, RPointDTO rPointDTO, FlavorDTO flavorDTO) throws Exception {
		favoriteDAO.addCupnote(cupnoteDTO);
		favoriteDAO.addRPoint(rPointDTO);
		favoriteDAO.addFlavor(flavorDTO);
	}
}
