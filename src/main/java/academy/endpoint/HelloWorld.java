package academy.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorld {
    @GetMapping("/ola")
    public String helloWorld(){
        return "Hello World";
    }
}
