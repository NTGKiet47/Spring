package com.example.config;


import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ProjectConfig {
    @Bean
    public Vehicle vehicle(){
        Vehicle v = new Vehicle();
        v.setName("Honda");
        return v;
    }
    @Bean
    public Person person(Vehicle v){
        Person p = new Person();
        p.setName("Gia Kiet");
        p.setVehicel(v);
        return p;
    }

}
