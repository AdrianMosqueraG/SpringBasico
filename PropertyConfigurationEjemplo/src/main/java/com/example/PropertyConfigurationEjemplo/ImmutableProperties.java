package com.example.PropertyConfigurationEjemplo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Data
@ConfigurationProperties(prefix = "immutable")
@ConstructorBinding
public class ImmutableProperties {
    private final String text;
    private final double number;
    private final String relaxBinding;
}
