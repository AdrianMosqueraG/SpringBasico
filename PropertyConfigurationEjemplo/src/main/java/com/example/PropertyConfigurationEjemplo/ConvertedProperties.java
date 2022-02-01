package com.example.PropertyConfigurationEjemplo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.util.unit.DataSize;

import java.time.Duration;
import java.time.Period;

@Data
@ConfigurationProperties(prefix = "converted")
@ConstructorBinding
@AllArgsConstructor
public class ConvertedProperties {
    private Duration duration;
    private Period period;
    private DataSize dataSize;
    private CustomProperty customProperty;

}
