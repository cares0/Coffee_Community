package com.cares.p1.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/board/**")
public class BoardController {
	
	@Autowired
	private BoardService boardService;

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public void list() throws Exception {
	}
}
