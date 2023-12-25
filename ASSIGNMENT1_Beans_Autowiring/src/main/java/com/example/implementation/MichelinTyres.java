package com.example.implementation;

import com.example.interfaces.Tyres;

public class MichelinTyres implements Tyres {
    @Override
    public String rotate() {
        return "Michelin rotates";
    }
}
