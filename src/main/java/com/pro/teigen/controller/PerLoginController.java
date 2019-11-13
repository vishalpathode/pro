package com.pro.teigen.controller;

import com.pro.teigen.domain.Response;
import com.pro.teigen.model.User;
import com.pro.teigen.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class PerLoginController {


	@Autowired
	private UserDao userDao;
	
	@PostMapping(value = "/registration")
	public ResponseEntity<Response> registration(@RequestBody User user){
		User dbUser = userDao.save(user);
		if(dbUser!=null) {
			 return new ResponseEntity<Response>(new Response("User is saved successfully",HttpStatus.OK.toString()),HttpStatus.OK);
		}
		return null;
	}
}
