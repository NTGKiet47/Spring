package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private final String name = "Gia Kiet";
//    The @Autowired marks on the class field
    private Vehicle vehicle;
    @Autowired
    public Person(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public String getName(){
        return name;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }


}
