package com.cares.p1.favorite;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cares.p1.InitTestCase;

public class FavoriteDAOTest extends InitTestCase{

	@Autowired
	private FavoriteDAO favoriteDAO;
	
	@Test
	public void check() {
		assertNotNull(favoriteDAO);
	}

}
