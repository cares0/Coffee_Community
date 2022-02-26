package com.cares.p1.board;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/board/**")
public class BoardController {
	
	@Autowired
	private BoardService boardService;

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public void list(Model model) throws Exception {
		List<BoardDTO> ar = boardService.list();		
		model.addAttribute("list", ar);
	}
	
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public void detail(BoardDTO boardDTO, Model model) throws Exception {
		boardDTO = boardService.detail(boardDTO);
		
		model.addAttribute("dto", boardDTO);
	}
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public void add() throws Exception {
		
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(BoardDTO boardDTO, HttpSession session) throws Exception {
		int result = boardService.add(boardDTO, session);
		
		return "redirect:./list";
	}
	
	
}
