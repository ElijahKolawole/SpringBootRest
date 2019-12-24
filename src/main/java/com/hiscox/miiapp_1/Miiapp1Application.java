package com.hiscox.miiapp_1;
//note that the configuration for this page and the rest of the application can be found in application.properties
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Miiapp1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Miiapp1Application.class, args);

       Alien a = context.getBean(Alien.class);
       a.show();

    }

}
