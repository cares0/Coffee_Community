package com.cares.p1.board;

import static org.junit.Assert.*;

import java.util.List;

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
	
	
	//@Test
	public void check() {
		assertNotNull(boardDAO);
		assertNotNull(boardService);
		assertNotNull(boardController);
	}
	
	@Test
	public void listTest() throws Exception {
		List<BoardDTO> ar = boardService.list();
		
		assertNotNull(ar);
		assertEquals(3, ar.size());
	}

}
