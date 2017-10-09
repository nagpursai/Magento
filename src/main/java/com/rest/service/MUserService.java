package com.rest.service;

import java.io.UnsupportedEncodingException;

import com.rest.request.UserRequest;

public interface MUserService {
	/**
	 * To connect to m
	 * @param req
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	String registerUser(UserRequest req) throws UnsupportedEncodingException;
}