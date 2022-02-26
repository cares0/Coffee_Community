package com.cares.p1.register;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cares.p1.InitTestCase;

public class RegisterDAOTest extends InitTestCase{

	@Autowired
	private RegisterDAO registerDAO;
	
	@Autowired
	private RegisterService registerService;
	
	@Autowired
	private RegisterController registerController;
	
	
	@Test
	public void check() {
		assertNotNull(registerDAO);
		assertNotNull(registerService);
		assertNotNull(registerController);
	}

}
