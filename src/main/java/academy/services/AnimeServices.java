package academy.services;

import academy.model.Anime;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AnimeServices {
    private List<Anime> animes = List.of(new Anime(3L, "Goku", 900));


}
