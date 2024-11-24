package br.com.will.endpoint;

import br.com.will.model.Anime;
import br.com.will.services.AnimeServices;
import br.com.will.util.DateUtil;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

import static java.util.Arrays.asList;

//@AllArgsConstructor // Criar um construtor com todos os atributos que a classe tem
//@Data // Gera Getters/setter/equals/hashCode/toString

@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor // Cria contrutor com os campos que são finais
@RestController

public class AnimeEndPoint {
    private AnimeServices animeServices;
    @GetMapping // Realiza a mesma coisa do @RequestMapping, mas de uma forma que tenha menos códigos
    public List<Anime> animes() {
//        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return asList((new Anime(1, "Naruto", 500))); //    @GetMapping(path = "/list") // Realiza a mesma coisa do @RequestMapping, mas de uma forma que tenha menos códigos@GetMapping(path = "/anime") // Realiza a mesma coisa do @RequestMapping, mas de uma forma que tenha menos códigos
    }

    @GetMapping(path = "/anime2")
    public List<Anime> animeList() {
//        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return animeServices.listAll();    //   @GetMapping(path = "/list") // Realiza a mesma coisa do @RequestMapping, mas de uma forma que tenha menos códigos

    }
}

