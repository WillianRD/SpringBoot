package br.com.will.endpoint;

import br.com.will.model.Anime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("anime")
public class AnimeEndPoint {
    @GetMapping(path = "/list") // Realiza a mesma coisa do @RequestMapping, mas de uma forma que tenha menos códigos

    public List<Anime> animes(){
        return asList(new Anime("Naruto", 500));
    }
}
