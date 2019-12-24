package com.hiscox.miiapp_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("home")
    //we are going to pass both the model and view within the controller class to fulfill MVC pattern.
    //@ResponseBody() // to create a string literal to be printed on page directly instead of executing an html page
    public ModelAndView home(Alien alien){
        ModelAndView mv = new ModelAndView();
        mv.addObject("obj", alien);
        mv.setViewName("home");
        System.out.println("Test: Hello servlet " + alien);
       // session.setAttribute("name", name);
        //return "home";
        return mv;
    }

    @RequestMapping("*")
    @ResponseBody() // to create a string literal to be printed on page directly instead of executing an html page
    public String error(){

        return "404: ERROR://Incorrect context path specified.";
    }

}
