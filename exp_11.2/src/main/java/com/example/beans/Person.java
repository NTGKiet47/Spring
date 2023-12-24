package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Gia Kiet";
//    The @Autowired marks on the class field
    private Vehicle vehicle;
    @Autowired
    public Person(Vehicle vehicle){
        System.out.println("Creating person bean");
        this.vehicle = vehicle;
    }
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
