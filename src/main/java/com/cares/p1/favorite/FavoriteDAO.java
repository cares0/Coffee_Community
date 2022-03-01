package com.cares.p1.favorite;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cares.p1.cupnote.CupnoteDTO;
import com.cares.p1.flavor.FlavorDTO;
import com.cares.p1.register.RegisterDTO;
import com.cares.p1.rpoint.RPointDTO;

@Repository
public class FavoriteDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "com.cares.p1.favorite.FavoriteDAO.";
	
	public RegisterDTO searchNum(RegisterDTO registerDTO ) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"searchNum", registerDTO);
	}
	
	public int addFavorite(RegisterDTO registerDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"addFavorite", registerDTO);
	}
	
	public FavoriteDTO searchFavorNums(RegisterDTO registerDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"searchFavorNums", registerDTO);
	}
	
	public int addCupnote(CupnoteDTO cupnoteDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"addCupnote", cupnoteDTO);
	}
	
	public int addRPoint(RPointDTO rPointDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"addRPoint", rPointDTO);
	}
	
	public int addFlavor(FlavorDTO flavorDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"addFlavor", flavorDTO);
	}
}
