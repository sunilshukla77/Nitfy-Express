package com.niftyexpress.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.niftyexpress.dto.UserDto;
@CrossOrigin
@RestController
@RequestMapping("/niftyexpress")
public class SignupController {
	
	@PostMapping("/signup")
	public @ResponseBody String signup(@RequestBody UserDto userDto) {
		System.out.println("Request Data:  "+ userDto.toString());
		if(userDto!= null) {
			return "Success";
		}else {
			return "Fail";
		}
		
	}

}
