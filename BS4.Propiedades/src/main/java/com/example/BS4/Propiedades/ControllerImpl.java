package com.example.BS4.Propiedades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ControllerImpl {

    @Autowired
    Variables variables;

    public String returnVariable(String value){

        String var;

        if(value.equals("VAR1")){
            var = variables.getVar1();
        }
        else if(value.equals("My.VAR2")){
            var = variables.getVar2();
        }
        else {
            var = value + " no tiene valor";
        }

        return var;

    }

}
