package com.example.PropertyConfigurationEjemplo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "nested")
@ConstructorBinding
@Data
@AllArgsConstructor
public class NestedProperties {
    private List<String> strings;
    private Map<String, String> dictionary;
    private final Item item;

}
