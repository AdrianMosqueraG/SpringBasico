package com.example.BS4.Perfiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Perfil2")
public class Perfil2 implements Perfiles{

    String perfil = "perfil2";

    @Override
    public String getProfile() {
        return perfil;
    }

    @Override
    public void miFuncion() {
        System.out.println("2");
    }
}
