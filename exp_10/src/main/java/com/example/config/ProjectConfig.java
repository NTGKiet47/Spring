package com.example.config;


import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
/*No changes with the the @Configuration and @ComponentScan
* Remaining unchange*/
@Configuration
public class ProjectConfig {
    @Bean
    public Vehicle vehicle(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Wave");
        return vehicle;
    }
    @Bean
    public Person person(Vehicle vehicle){
        Person person = new Person();
        person.setName("Gia Kiet");
//        Wiring by calling method
//        This is the most basic way to do wiring
        person.setVehicle(vehicle);

        return person;
    }
}
