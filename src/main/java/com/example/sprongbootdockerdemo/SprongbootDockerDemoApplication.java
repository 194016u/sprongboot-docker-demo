package com.example.sprongbootdockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SprongbootDockerDemoApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "springboot docker demo";
    }

    public static void main(String[] args) {
        SpringApplication.run(SprongbootDockerDemoApplication.class, args);
    }

}
