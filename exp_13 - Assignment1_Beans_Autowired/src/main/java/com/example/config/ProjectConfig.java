package com.example.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
@Configuration
@ComponentScan(basePackages = {
        "com.example.services",
        "com.example.implementation"
})
@ComponentScan(basePackageClasses = {
        com.example.beans.Vehicle.class,
        com.example.beans.Person.class
})
public class ProjectConfig {
}
