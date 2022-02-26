package com.cares.p1.board;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cares.p1.InitTestCase;

public class BoardDAOTest extends InitTestCase {

	@Autowired
	private BoardDAO boardDAO;
	
	@Autowired
	private BoardService boardService;
	
	@Autowired
	private BoardController boardController;
	
	
	@Test
	public void check() {
		assertNotNull(boardDAO);
		assertNotNull(boardService);
		assertNotNull(boardController);
	}

}
