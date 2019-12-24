package com.hiscox.miiapp_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("home")
    //@ResponseBody() // to create a string literal to be printed on page directly instead of executing an html page
    public String home(){
        return "home";
    }

    @RequestMapping("*")
    @ResponseBody() // to create a string literal to be printed on page directly instead of executing an html page
    public String error(){
        return "404: ERROR://Incorrect context path specified.";
    }

}
