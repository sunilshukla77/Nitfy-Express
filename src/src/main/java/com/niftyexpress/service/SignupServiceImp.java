package com.niftyexpress.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niftyexpress.dao.SigupDao;
import com.niftyexpress.dto.UserDto;
import com.niftyexpress.entity.UserEntity;

@Service
public class SignupServiceImp implements SignupService{

	
	@Autowired
	private SigupDao signupDao;
	@Override
	public String signup(UserDto ud) {
		UserEntity ue  = new UserEntity(ud.getName(), "", ud.getUsername(), ud.getPassword(),ud.getEmailId(), "", ud.getMobileNo());
		UserEntity result = signupDao.saveUserDetail(ue);
		System.out.println(result.toString());
		return result.getId();
	}

}
