/**
 * 
 */
package com.niftyexpress.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niftyexpress.login.dao.UserDetailRepository;
import com.niftyexpress.login.dto.LoginDto;
import com.niftyexpress.entity.UserEntity;

/**
 * @author Sunil Shukla
 *
 */
@Service
public class LoginServiceImpl implements LoginService {

	private static final Logger LOG = LoggerFactory.getLogger(LoginServiceImpl.class);

	@Autowired
	UserDetailRepository userdetailrepository;

	@Override
	public String login(LoginDto ld) {
		try {
			UserEntity userentry =userdetailrepository.findByUserEmailAndPassword(ld.getEmailId(), ld.getPassword());
			LOG.info("Welcome : {}  {}", userentry.getName(), userentry.getEmail());
			return "Success";

		} catch (Exception e) {
			LOG.error("Inavalid Useremail Password");
			return "Failure";
		}

	}

}
