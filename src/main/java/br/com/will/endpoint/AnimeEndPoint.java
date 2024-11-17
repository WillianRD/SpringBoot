package br.com.will.endpoint;

import br.com.will.model.Anime;
import br.com.will.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
//@RequestMapping("/anime")
//@Log4j2
//@AllArgsConstructor // Criar um construtor com todos os atributos que a classe tem
//@RequiredArgsConstructor // Cria contrutor com os campos que são finais
public class AnimeEndPoint {
//    private final DateUtil dateUtil;

    @GetMapping(path = "/anime") // Realiza a mesma coisa do @RequestMapping, mas de uma forma que tenha menos códigos
    public List<Anime> animes() {
//        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return asList((new Anime("Naruto", 500))); //    @GetMapping(path = "/list") // Realiza a mesma coisa do @RequestMapping, mas de uma forma que tenha menos códigos@GetMapping(path = "/anime") // Realiza a mesma coisa do @RequestMapping, mas de uma forma que tenha menos códigos
    }

    @GetMapping(path = "/animeeps")
        public List<Anime> animeList () {
//        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
            return asList((new Anime("One Piece", 500))); //    @GetMapping(path = "/list") // Realiza a mesma coisa do @RequestMapping, mas de uma forma que tenha menos códigos

        }
    }
