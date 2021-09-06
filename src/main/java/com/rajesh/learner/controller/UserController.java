/**
 * 
 */
package com.rajesh.learner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rajesh.learner.model.UserRecord;
import com.rajesh.learner.service.UserService;

/**
 * @author rkumar4
 *
 */
@RestController
public class UserController {
	
	@Autowired    
	private UserService userService;
	
	@GetMapping("/")
	public List<UserRecord> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping(value="/add-user", method=RequestMethod.POST)
	public void addUser(@RequestBody UserRecord userRecord) {
		userService.addUser(userRecord);
	}

}
