package br.com.will.model.started;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class AplicationStart {
    public static void main(String[] args){
        SpringApplication.run(AplicationStart.class, args);
    }
}
