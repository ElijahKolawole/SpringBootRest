package com.hiscox.miiapp_1;

import com.sun.media.jfxmediaimpl.HostUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")//by default singleton design suggest create onl one instance of the object irrespective of how many times you instanciate the class. Prototype says, create according to the amount of instanciation
public class Alien {
    private String aid;
    private String aName;
    private String tech;
    @Autowired
    @Qualifier("lap1")
    private Laptop laptop;

    public Alien() {
        System.out.println("ALien object created");
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public void show(){
        System.out.println("Alien class working...");
        laptop.compile();
    }
}
