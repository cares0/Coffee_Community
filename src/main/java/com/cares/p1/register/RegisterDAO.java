package com.cares.p1.register;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cares.p1.favorite.FavoriteDTO;

@Repository
public class RegisterDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "com.cares.p1.register.RegisterDAO.";

	public int join(RegisterDTO registerDTO) throws Exception {
		return sqlSession.update(NAMESPACE+"join", registerDTO);
	}
	
	public RegisterDTO login(RegisterDTO registerDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"login", registerDTO);
	}
	
	public RegisterDTO mypage(RegisterDTO registerDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"mypage", registerDTO);
	}
	
	public FavoriteDTO favoritePage(RegisterDTO registerDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"favoritePage", registerDTO);
	}
	
}
