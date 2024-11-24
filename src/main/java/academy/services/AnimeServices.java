package academy.services;

import academy.model.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeServices {
//    private AnimeRepository animeRepository;
    public List<Anime> listAll() {
        return List.of(new Anime(3L, "Goku", 900),
                new Anime(4L, "Bokug", 1000));
    }
}
