package com.example.beans;

public class Person {
    private String name;
    private Vehicle vehicle;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setVehicel(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
}
