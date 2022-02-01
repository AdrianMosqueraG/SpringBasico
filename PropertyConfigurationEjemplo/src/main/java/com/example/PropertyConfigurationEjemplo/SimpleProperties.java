package com.example.PropertyConfigurationEjemplo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
//@Component
@ConfigurationProperties(prefix = "simple")
public class SimpleProperties {

    private String text;
    private int number;


}
