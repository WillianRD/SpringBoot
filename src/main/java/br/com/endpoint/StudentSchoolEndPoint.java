package br.com.endpoint;

import br.com.model.StudentSchoolAnhanguera;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
public class StudentSchoolEndPoint {
    @RequestMapping(path = "students")
    public List<StudentSchoolAnhanguera> studntSchool() {
       return asList(new StudentSchoolAnhanguera("Leide Cardozo",20,"Front-End", (byte) 4,3),
                    new StudentSchoolAnhanguera("Yuri de Souza", 30,"Full Stack",(byte) 4,50),
                    new StudentSchoolAnhanguera("Willian S Rodrigues",18,"Back-End",(byte) 4,2));

    }

}
