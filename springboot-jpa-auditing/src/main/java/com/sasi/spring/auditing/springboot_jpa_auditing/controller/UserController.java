/**
 * @author sasi
 *
 */
package com.sasi.spring.auditing.springboot_jpa_auditing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sasi.spring.auditing.springboot_jpa_auditing.entity.User;
import com.sasi.spring.auditing.springboot_jpa_auditing.repository.UserRepository;

/**
 * 
 */


@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	   @Autowired
	    private UserRepository userRepository;
 
	 
	    @GetMapping("/users")
	    public List<User> getAllUsers() {
	         return userRepository.findAll();
	    }

	 

}
