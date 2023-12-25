package com.example.implementation;

import com.example.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component(value = "boseBean")
public class BoseSpeakers implements Speakers {
    @Override
    public String makeSound(){
        return "Bose speaker makes sound";
    }
}
