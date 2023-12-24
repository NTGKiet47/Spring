package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;
import java.util.function.Supplier;

public class example10 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        Person person = context.getBean(Person.class);
        System.out.println("Vehicle name: "+vehicle.getName());
        System.out.println("Person name: "+person.getName());
//        Can print the vehicle like this, using getName of method
//        System.out.println("Vehicel of "+person.getName() + " is: "+person.getVehicle().getName());
//        Printing vehicle name by using toString
        System.out.println(person.getName() + "'s "+person.getVehicle());
    }
}
