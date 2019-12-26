package com.hiscox.miiapp_1.controller;

import com.hiscox.miiapp_1.dao.AlienRepo;
import com.hiscox.miiapp_1.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam int aId){
        ModelAndView mv = new ModelAndView("alienfetch");
        Alien alien = repo.findById(aId).orElse(new Alien());
        System.out.println("findByLang: " + repo.findByLang("java"));
       //System.out.println("findByAidGreaterThan: " + repo.findByAidGreaterThan(102));
        System.out.println("findByLangSorted: " + repo.findByLangSorted("java"));
        mv.addObject(alien);
        return  mv;
    }

}