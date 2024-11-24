package academy.endpoint;

import academy.model.Teacher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RestController // Classe Controladora
//@RequestMapping("teacher") // Mapear a requisição teacher
public class TeacherEndPoint {
    @RequestMapping(method = RequestMethod.GET,path = "/teacher")
    public List<Teacher> teachers (){
        return asList(new Teacher("Professor Willian","Anhanguera Anchiteta",100.2D,2.500D,50));
    }
}
