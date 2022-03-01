package com.cares.p1.favorite;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FavoriteDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "com.cares.p1.favorite.FavoriteDAO.";
}
