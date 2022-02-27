package com.cares.p1.board;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cares.p1.register.RegisterDTO;
import com.cares.p1.util.Pager;

@Controller
@RequestMapping(value = "/board/**")
public class BoardController {
	
	@Autowired
	private BoardService boardService;

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public void list(Model model, Pager pager) throws Exception {
		List<BoardDTO> ar = boardService.list(pager);
		model.addAttribute("pager", pager);
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
	
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String delete(BoardDTO boardDTO, HttpSession session) throws Exception {
		
		RegisterDTO registerDTO = (RegisterDTO) session.getAttribute("member");
		if (registerDTO == null || !registerDTO.getNickname().equals(boardDTO.getWriter())) {			
			return "redirect:./list";
		}
				
		int result = boardService.delete(boardDTO);
		return "redirect:./list";
	}
	
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String update(BoardDTO boardDTO, Model model, HttpSession session) throws Exception {
		RegisterDTO registerDTO = (RegisterDTO) session.getAttribute("member");
		if (registerDTO == null || !registerDTO.getNickname().equals(boardDTO.getWriter())) {			
			return "redirect:./list";
		}
		boardDTO = boardService.detail(boardDTO);
		model.addAttribute("dto", boardDTO);
		return "board/update";
	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(BoardDTO boardDTO) throws Exception {
		int result = boardService.update(boardDTO);
		
		return "redirect:./detail?num="+boardDTO.getNum();
	}
}
