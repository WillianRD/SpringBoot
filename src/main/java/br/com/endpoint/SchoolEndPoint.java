package br.com.endpoint;

import br.com.model.School;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import static java.util.Arrays.asList;

@RestController
@RequestMapping()
public class SchoolEndPoint {
    @RequestMapping(method= RequestMethod.GET,path = "/school")
    public List<School>  schools (){
        return asList(new School(1,"Faculdade Anhanguera Anchieta","Rua Atlantica","(11) 98910-0652","anhangueraSbc@anhanguera.com",
                "https://login.kroton.com.br/AccountAluno/Login?client_id=169104&response_type=code&referrer=alunodigital.anhanguera.com",1000,40),
        new School(2,"USP","São Paulo","11 4066-2476","universidadeUsp@usp.com",
                "www.usp.com.br",5000,120));
    }
}
