package com.example.beans;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Vehicle {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initialize(){
        this.name = "Gia Kiet";
    }
    @PreDestroy
    public void destroy() {
        System.out.println(
                "Destroying");
    }


}
