package com.hiscox.miiapp_1.controller;

import com.hiscox.miiapp_1.dao.AlienRepo;
import com.hiscox.miiapp_1.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
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
        //for MVC
    @RequestMapping("/getAlien") //searches for viewname in which to display the current responsedata
    public ModelAndView getAlien(@RequestParam int aId){
        ModelAndView mv = new ModelAndView("alienfetch");
        Alien alien = repo.findById(aId).orElse(new Alien());
        System.out.println("findByLang: " + repo.findByLang("java"));
       //System.out.println("findByAidGreaterThan: " + repo.findByAidGreaterThan(102));
      //  System.out.println("findByLangSorted: " + repo.findByLangSorted("java"));
        mv.addObject(alien);
        return  mv;
    }

    //for REST or web services
    //@RequestMapping(path="/aliens", produces = {"application/xml"})
    @RequestMapping("/aliens")
   // @ResponseBody()//does not look for any view. Simply return data as a web resource
    public List<Alien> returnAliens(){
        return repo.findAll();
    }

    @RequestMapping("/alien/{aid}")
    //@ResponseBody()//does not look for any view. Simply return data as a web resource
    public Optional<Alien> returnAlien(@PathVariable("aid") int aid){
        return repo.findById(aid);
    }

    @PostMapping("/alien/{aid}")
   // @ResponseBody()//does not look for any view. Simply return data as a web resource
    public Optional<Alien> receiveAlien(@PathVariable("aid") int aid){
        return repo.findById(aid);
    }


}
