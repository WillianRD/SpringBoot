package academy.started;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "academy")

public class AplicationStart {
    public static void main(String[] args){
        SpringApplication.run(AplicationStart.class, args);
    }
}
