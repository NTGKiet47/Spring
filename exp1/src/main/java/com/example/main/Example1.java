package com.example.main;

import com.example.beans.Vehicles;
import com.example.config.ProjectConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigBeanDefinitionParser;

import java.lang.annotation.Annotation;

public class Example1 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Vehicle.class is data type off Vehicle bean
        Vehicles v = context.getBean("vehicle3",Vehicles.class);
        System.out.println(v.getName());
    }
}
