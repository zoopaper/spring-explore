package org.spring.explore.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@Scope("prototype")
public class UserController {

    private static int staticNum = 0;
    private int noStaticNum = 0;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ModelAndView userView() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userView");

        System.out.println(staticNum++ + " | " + noStaticNum++);
        return modelAndView;
    }
}
