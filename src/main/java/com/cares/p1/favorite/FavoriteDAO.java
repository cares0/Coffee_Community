package com.cares.p1.favorite;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cares.p1.register.RegisterDTO;

@Repository
public class FavoriteDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "com.cares.p1.favorite.FavoriteDAO.";
	
	public int add(FavoriteDTO favoriteDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"add", favoriteDTO);
	}
	
	public RegisterDTO searchFavoriteNum(RegisterDTO registerDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"searchFavoriteNum", registerDTO);
	}
}
