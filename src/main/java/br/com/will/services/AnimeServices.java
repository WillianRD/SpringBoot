package br.com.will.services;

import br.com.will.model.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeServices {
    public List<Anime> listAll() {
        return List.of(new Anime(3L, "Goku", 900),
                new Anime(4L, "Bokug", 1000));
    }
}
