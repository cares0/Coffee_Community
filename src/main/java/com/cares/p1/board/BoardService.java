package com.cares.p1.board;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cares.p1.register.RegisterDTO;

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
	
	public int add(BoardDTO boardDTO, HttpSession session) throws Exception {		
		RegisterDTO registerDTO = (RegisterDTO) session.getAttribute("member");		
		boardDTO.setWriter(registerDTO.getNickname());		
		
		return boardDAO.add(boardDTO);
	}
}
