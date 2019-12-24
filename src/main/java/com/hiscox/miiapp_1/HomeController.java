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
    public ModelAndView home(@RequestParam("name") String name, HttpSession session){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name, ");
        mv.setViewName("home");
        System.out.println("Test: Hello servlet " + name);
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
