package com.cares.p1.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cares.p1.favorite.FavoriteDTO;

@Service
public class RegisterService {

	@Autowired
	private RegisterDAO registerDAO;
	
	public int join(RegisterDTO registerDTO) throws Exception {
		return registerDAO.join(registerDTO);
	}
	
	public RegisterDTO login(RegisterDTO registerDTO) throws Exception {
		return registerDAO.login(registerDTO);
	}
	
	public RegisterDTO mypage(RegisterDTO registerDTO) throws Exception {
		return registerDAO.mypage(registerDTO);
	}
	
	public FavoriteDTO favoritePage(RegisterDTO registerDTO) throws Exception {
		return registerDAO.favoritePage(registerDTO);
	}
}
