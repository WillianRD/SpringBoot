package br.com.will.endpoint;

import br.com.will.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RestController // Retorna o dado com JSON - Indica que a classe ela é controladora
//@RequestMapping("student") // Utilizadad para mapear as requisições HTTP
public class StudentEndPoint {
    @RequestMapping(method = RequestMethod.GET,path = "/student") // Utilizadado para mapear as requisições HTTP localhost:8080/student/list
    public List<Student> students(){
        return  asList(new Student("Will",100,"Ads",2),
                new Student(" Coda Fofo",5,"Ads",2),
                new Student("Yuri",120,"Ads", 20),
                new Student("Jhow", 0,"Informática",1));
    }
}
