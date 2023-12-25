package com.example.services;


import com.example.interfaces.Speakers;
import com.example.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {
    @Autowired
    private Speakers speakers;
    @Autowired
    private Tyres tyres;

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public void playMusic(){
        String music = speakers.makeSound();
        System.out.println(music);
    }
    public void moveVehicle(){
        String status = tyres.rotate();
        System.out.println(status);
    }
}