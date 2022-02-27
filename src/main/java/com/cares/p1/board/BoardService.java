package com.cares.p1.board;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cares.p1.register.RegisterDTO;
import com.cares.p1.util.Pager;

@Service
public class BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	public List<BoardDTO> list(Pager pager) throws Exception {
		pager.makeRow();
		Long totalCount = boardDAO.getTotal(pager);
		pager.makeNum(totalCount);
		return boardDAO.list(pager);
	}
	
	public BoardDTO detail(BoardDTO boardDTO) throws Exception {
		return boardDAO.detail(boardDTO);
	}
	
	public int add(BoardDTO boardDTO, HttpSession session) throws Exception {		
		RegisterDTO registerDTO = (RegisterDTO) session.getAttribute("member");		
		boardDTO.setWriter(registerDTO.getNickname());		
		
		return boardDAO.add(boardDTO);
	}
	
	public int delete(BoardDTO boardDTO) throws Exception {
		return boardDAO.delete(boardDTO);
	}
	
	public int update(BoardDTO boardDTO) throws Exception {
		return boardDAO.update(boardDTO);
	}
}
