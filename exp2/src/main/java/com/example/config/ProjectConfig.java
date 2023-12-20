package com.example.config;


import com.example.beans.Vehicles;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*The @Configuration indicates that the class has Bean definition methods.
 Makes sure that the IoC
 container will read all the content inside
 the class below the @Configuration
 so that all the bean are made and used in the app*/
@Configuration
public class ProjectConfig {

/* the classes' name which create @Bean can be noun*/
    @Bean
    Vehicles vehicle1(){
        var v1 = new Vehicles();
        v1.setName("CHERVOLET");
        return v1;
    }
    @Bean
    Vehicles vehicle2(){
        var v1 = new Vehicles();
        v1.setName("MERCEDES");
        return v1;
    }
    @Bean
    Vehicles vehicle3(){
        var v1 = new Vehicles();
        v1.setName("FORD");
        return v1;
    }
}
