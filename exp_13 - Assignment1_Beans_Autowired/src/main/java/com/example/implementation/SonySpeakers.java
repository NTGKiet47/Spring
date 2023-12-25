package com.example.implementation;

import com.example.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "sonyBean")
@Primary
public class SonySpeakers implements Speakers {
    @Override
    public String makeSound(){
        return "Sony speaker makes sound";
    }
}
