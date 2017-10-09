package com.rest.controller;

import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.request.UserRequest;
import com.rest.service.MUserService;
/**
 * 
 * @author ABC
 *
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
	private static final Logger logger = LoggerFactory
			.getLogger(UserController.class);
	
	@Autowired
	MUserService userService;
	/**
	 * 
	 * @param ticket
	 * @return
	 */
	@RequestMapping(value = "regUser", method = RequestMethod.POST)
	public ResponseEntity<String> registerUser(@RequestBody UserRequest request){
		logger.info(this.getClass().getName() + " - registerUser - START");
		String result = "Fail";
		try {
			result = userService.registerUser(request);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info(this.getClass().getName() + " - registerUser - END");
		return new ResponseEntity<String>(result,HttpStatus.OK);
	}
}
