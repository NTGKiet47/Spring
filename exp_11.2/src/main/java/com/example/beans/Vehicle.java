package com.example.beans;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


/*Creating Bean base on condition will not accquire the @Component
* Which means the Spring will not autimatically creating Bean
* with this class*/
@Component
public class Vehicle {
    private String name = "Honda";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return name;
    }
}
