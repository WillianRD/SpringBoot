package br.com.repository;

import br.com.model.Anime;
import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}
