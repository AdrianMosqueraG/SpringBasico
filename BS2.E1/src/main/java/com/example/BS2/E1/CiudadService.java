package com.example.BS2.E1;

import java.util.ArrayList;

public interface CiudadService {

    Ciudad addCiudad(String nombre, Integer nHabitantes);

    ArrayList<Ciudad> getCiudad();

}
