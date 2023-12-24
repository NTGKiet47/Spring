package com.example.config;


import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
/*No changes with the the @Configuration and @ComponentScan
* Remaining unchange*/
@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {}
