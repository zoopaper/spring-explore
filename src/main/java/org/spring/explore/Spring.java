package org.spring.explore;

import org.spring.explore.controller.UserController;
import org.spring.explore.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kris
 *
 */
public class Spring {
	public static void main(String[] args) {
		
		ApplicationContext factory=new ClassPathXmlApplicationContext("classpath:applicationContext.xml"); 
		
		UserController userController =(UserController)factory.getBean("userController");
		
		userController.addUser(new User());
		
	}
}
