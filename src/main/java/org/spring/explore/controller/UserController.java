package org.spring.explore.controller;

import org.spring.explore.entity.User;
import org.spring.explore.service.UserService;

public class UserController {

	private UserService userService;

	public void addUser(User user) {
		userService.addUser(user);

	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
