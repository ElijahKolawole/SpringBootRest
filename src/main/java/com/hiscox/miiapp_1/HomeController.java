package com.hiscox.miiapp_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("home")
    //@ResponseBody() // to create a string literal to be printed on page directly instead of executing an html page
    public String home(HttpServletRequest req){
        HttpSession session = req.getSession();
        String name = req.getParameter("name");
        System.out.println("Test: Hello servlet " + name);
        session.setAttribute("name", name);
        return "home";
    }

    @RequestMapping("*")
    @ResponseBody() // to create a string literal to be printed on page directly instead of executing an html page
    public String error(){
        return "404: ERROR://Incorrect context path specified.";
    }

}
