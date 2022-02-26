package com.cares.p1.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	public List<BoardDTO> list() throws Exception {
		return boardDAO.list();
	}
	
	public BoardDTO detail(BoardDTO boardDTO) throws Exception {
		return boardDAO.detail(boardDTO);
	}
}
