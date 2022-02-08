package com.example.BS4.Perfiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@PropertySource("classpath:miconfig.properties")
public class Configuracion {

    @Value("${VAR1}")
    private String var1;

    @Value("${VAR2}")
    private String var2;


    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public String getVar2() {
        return var2;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }

    @PostConstruct
    public void printValues(){

        System.out.println(var1 +" "+ var2);
    }

}
