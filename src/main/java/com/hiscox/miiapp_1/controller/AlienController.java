package com.hiscox.miiapp_1.controller;

import com.hiscox.miiapp_1.dao.AlienRepo;
import com.hiscox.miiapp_1.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlienController {
    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/addAlien")
    public String addAlien(Alien alien){
        repo.save(alien);
        return "index";
    }
}
