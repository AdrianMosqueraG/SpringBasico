package com.example.BS2.E1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

//@Service
public class CiudadServiceImpl implements CiudadService{

    ArrayList<Ciudad> listaCiudades = new ArrayList<>();

    Ciudad ciudad = new Ciudad();

    @Override
    public Ciudad addCiudad(String nombre, Integer nHabitantes) {
        Ciudad c = new Ciudad();

        c.setNombre(nombre);
        c.setNHabitantes(nHabitantes);

        listaCiudades.add(c);
        return c;
    }

    @Override
    public ArrayList<Ciudad> getCiudad() {
       return listaCiudades;
    }
}
