package org.spring.explore;

import org.spring.explore.controller.UserController;
import org.spring.explore.entity.User;
import org.spring.explore.service.UserService;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

public class HardCodeBeanFactory {

    public static void main(String[] args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        BeanFactory container = bind(factory);
        UserController uc = (UserController) container.getBean("userController");
//        uc.addUser(new User());

    }

    public static BeanFactory bind(BeanDefinitionRegistry registry) {
        AbstractBeanDefinition controller = new RootBeanDefinition(UserController.class, true);
        AbstractBeanDefinition userService = new RootBeanDefinition(UserService.class, true);
        registry.registerBeanDefinition("userController", controller);
        registry.registerBeanDefinition("userService", userService);
        MutablePropertyValues propertyVlaue = new MutablePropertyValues();
        propertyVlaue.addPropertyValue(new PropertyValue("userService", userService));
        controller.setPropertyValues(propertyVlaue);

        //构造函数注入方式
        // ConstructorArgumentValues argValue= new ConstructorArgumentValues();
        // argValue.addIndexedArgumentValue(0, userService);
        // controller.setConstructorArgumentValues(argValue);

        return (BeanFactory) registry;

    }
}
