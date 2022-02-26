package com.cares.p1.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

	@Autowired
	private RegisterDAO registerDAO;
	
	public int join(RegisterDTO registerDTO) throws Exception {
		return registerDAO.join(registerDTO);
	}
}
