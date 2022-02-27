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
	
//	@Test
//	public void listTest() throws Exception {
//		List<BoardDTO> ar = boardService.list();
//		
//		assertNotNull(ar);
//		assertEquals(3, ar.size());
//	}
	
	@Test
	public void addTest() throws Exception {
		for(int i=0; i<200; i++) {
			BoardDTO boardDTO = new BoardDTO();
			boardDTO.setTitle("t"+i);
			boardDTO.setContents("c"+i);
			boardDTO.setWriter("cares");
			boardDAO.add(boardDTO);
			
			if(i%10==0) {
				Thread.sleep(1000);
			}
		}
		System.out.println("finish");
	}

}
