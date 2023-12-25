package com.example.beans;
import com.example.services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component(value = "beanVehicle")
public class Vehicle {
    private String name = "Wave";
    @Autowired
    private VehicleServices vehicleServices;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }

    public void setVehicleServices(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
    }
    @Override
    public String toString(){
        return "Vehicle name is "+name;
    }
}
