package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name = "Honda";
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "Vehicle name is "+name;
    }
}