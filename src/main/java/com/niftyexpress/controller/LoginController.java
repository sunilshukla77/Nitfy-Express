/**
 * 
 */
package com.niftyexpress.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.niftyexpress.login.dto.LoginDto;
import com.niftyexpress.service.LoginServiceImpl;

/**
 * @author iniyann
 *
 */
@CrossOrigin
@RestController
@RequestMapping("/niftyexpress")
public class LoginController {
	private static final Logger LOG = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	LoginServiceImpl loginService;
	
	@PostMapping("/signin")
	public @ResponseBody String getLogin(@RequestBody LoginDto ld) {	
		LOG.info(ld.toString());
		return loginService.login(ld);		
	}

}
