package br.com.will.model;

public class Anime {
    private String nameAnime;
    private int eps;

    public Anime(String nameAnime, int eps){
        this.nameAnime = nameAnime;
        this.eps = eps;
    }

    public String getNameAnime(){
        return nameAnime;
    }

    public int getEps(){
        return eps;
    }
}
