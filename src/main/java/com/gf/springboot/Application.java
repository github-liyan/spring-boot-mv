package com.gf.springboot;

import com.gf.springboot.config.AppConfig;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

    @RequestMapping("/")
    String home(){
        return "Hello World !";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
