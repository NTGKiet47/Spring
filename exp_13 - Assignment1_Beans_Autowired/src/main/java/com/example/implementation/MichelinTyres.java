package com.example.implementation;

import com.example.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "mechilinBean")
@Primary
public class MichelinTyres implements Tyres {
    @Override
    public String rotate(){
        return "Michelin rotates";
    }
}
