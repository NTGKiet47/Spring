package com.example.main;

import com.example.beans.*;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class example13 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person p = context.getBean(Person.class);
        p.getVehicle().getVehicleServices().playMusic();
        p.getVehicle().getVehicleServices().moveVehicle();
    }
}
