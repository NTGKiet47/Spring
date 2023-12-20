package com.example.main;

import com.example.beans.Vehicles;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicles v = context.getBean("Mercedes",Vehicles.class);
        System.out.println(v.getName());
    }
}
