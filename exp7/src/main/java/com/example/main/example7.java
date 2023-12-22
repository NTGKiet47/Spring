package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;
import java.util.function.Supplier;

public class example7 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();

        // Creat the supplier with 2 ways
        // C1:
        Supplier<Vehicle> hondaSupplier = () -> {
          Vehicle c1 = new Vehicle();
          c1.setName("honda");
          return c1;
        };
        // C2:
        Vehicle c2 = new Vehicle();
        c2.setName("yamaha");
        Supplier<Vehicle> yamahaSupplier = () -> c2;

        if(n%2 == 0){
            context.registerBean("honda", Vehicle.class, hondaSupplier);
        }else{
            context.registerBean("yamaha", Vehicle.class, yamahaSupplier);
        }

        Vehicle honda = null;
        Vehicle yamaha = null;
        try{
            honda = context.getBean("honda", Vehicle.class);
        }catch(NoSuchBeanDefinitionException err){
            System.out.println("Honda created failed");
        }
        try{
            yamaha = context.getBean("yamaha", Vehicle.class);
        }catch(NoSuchBeanDefinitionException err){
            System.out.println("Yamaha created failed");
        }
        if(honda != null){
            System.out.println("Vehicle name: " + honda.getName());
        }
        if(yamaha != null){
            System.out.println("Vehicle name: " + yamaha.getName());
        }
    }
}
