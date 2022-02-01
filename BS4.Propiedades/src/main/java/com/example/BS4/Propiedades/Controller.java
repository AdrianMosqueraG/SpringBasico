package com.example.BS4.Propiedades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Controller {

    @Autowired
    ControllerImpl controllerImpl;

    @GetMapping("/valores/{valor}")
    public String returnValor(@PathVariable String valor) {
        return controllerImpl.returnVariable(valor);
    }
}
