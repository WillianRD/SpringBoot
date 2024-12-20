package academy.model;

import lombok.AllArgsConstructor;
import lombok.Data;

//@Data // Gerando getters/setters/equals/hashCode/toString
@AllArgsConstructor // Criando um construtor com todos os atributos

public class Anime {
    private long id;
    private String nameAnime;
    private int eps;

    public long getId() {
        return id;
    }

    public String getNameAnime() {
        return nameAnime;
    }

    public int getEps() {
        return eps;
    }
}
