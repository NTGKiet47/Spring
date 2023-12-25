package com.example.implementation;

import com.example.interfaces.Speakers;

public class SonySpeakers implements Speakers {
    @Override
    public String makeSound() {
        return "Sony Sony";
    }
}
