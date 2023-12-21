package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class example5 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle v = context.getBean(Vehicle.class);
/*Right here the name return will be NULL
 because dev cannot control while creating the object
 So that also means why the project config has no content*/
        System.out.println("Name: "+v.getName());
    }
}
