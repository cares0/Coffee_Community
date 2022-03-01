package com.cares.p1.favorite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriteService {

	@Autowired
	private FavoriteDAO favoriteDAO;
}
