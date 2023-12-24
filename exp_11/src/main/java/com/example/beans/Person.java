package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    private String name;
//    The @Autowired marks on the class field
    @Autowired
    private Vehicle vehicle;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }
}
