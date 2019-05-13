package com.barath.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.barath.app.model.User;
import com.barath.app.service.UserService;

/**
 * @author barath
 */
@RestController
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@RequestMapping(value="/",method = RequestMethod.GET)
    public String home(){
        return "home";
    }

    @RequestMapping(value="/user",method = RequestMethod.GET)
    public User findUserByName(@RequestParam("name") String userName){
        return  this.userService.getUserByUserName(userName);
    }
}
