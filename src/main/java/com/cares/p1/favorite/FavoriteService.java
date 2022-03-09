package com.cares.p1.favorite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cares.p1.register.RegisterDTO;

@Service
public class FavoriteService {

	@Autowired
	private FavoriteDAO favoriteDAO;
	
	public int add(FavoriteDTO favoriteDTO, RegisterDTO registerDTO) throws Exception {
		registerDTO = favoriteDAO.searchFavoriteNum(registerDTO);
		favoriteDTO.setFavoriteNum(registerDTO.getFavoriteNum());
		return favoriteDAO.add(favoriteDTO);
	}
	
	
	
}
