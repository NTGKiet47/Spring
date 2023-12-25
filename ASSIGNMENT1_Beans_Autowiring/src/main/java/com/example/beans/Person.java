package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Gia Kiet";
    private Vehicle vehicle;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    @Autowired
    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }
}
