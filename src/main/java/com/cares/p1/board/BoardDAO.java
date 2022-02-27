package com.cares.p1.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "com.cares.p1.board.BoardDAO."; 
	
	public List<BoardDTO> list() throws Exception {
		return sqlSession.selectList(NAMESPACE+"list");
	}
	
	public BoardDTO detail(BoardDTO boardDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"detail", boardDTO);
	}
	
	public int add(BoardDTO boardDTO) throws Exception {
		return sqlSession.update(NAMESPACE+"add", boardDTO);
	}
	
	public int delete(BoardDTO boardDTO) throws Exception {
		return sqlSession.delete(NAMESPACE+"delete", boardDTO);
	}
	
	public int update(BoardDTO boardDTO) throws Exception {
		return sqlSession.update(NAMESPACE+"update", boardDTO);
	}
}
