package com.example.BS4.Perfiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Perfil1")
public class Perfil1 implements Perfiles{

    private static final String Perfil1 = "THIS IS PROFILE ONE";

    String perfil = "perfil1";

    @Override
    public String getProfile() {
        return perfil;
    }

    @Override
    public void miFuncion() {
        System.out.println("1");
    }
}
