package org.spring.explore;

import org.spring.explore.controller.UserController;
import org.spring.explore.entity.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

/**
 * @author kris
 */
public class ConfigFileBeanFactory {


    public static void main(String[] args) {

        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        XmlBeanFactory factory3 = new XmlBeanFactory("classpath:applicationContext.xml");



        ApplicationContext factory2 = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");


        UserController userController = (UserController) factory.getBean("userController");
        String id = factory.getId();
//        userController.addUser(new User());


        Boolean isPrototype = factory.isPrototype("userController");
        ClassLoader classLoader =factory.getClassLoader();

        System.out.println(classLoader.getClass().getCanonicalName());

        System.out.println(isPrototype);

        System.out.println(id);
        boolean isContainsBean = factory.containsBean("userController2");
        System.out.println("isContainsBean:" + isContainsBean);
    }
}
