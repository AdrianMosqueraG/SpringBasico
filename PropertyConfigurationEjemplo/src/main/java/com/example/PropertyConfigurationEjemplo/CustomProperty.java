package com.example.PropertyConfigurationEjemplo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomProperty {

    private String name;
    private boolean immutable;

}
