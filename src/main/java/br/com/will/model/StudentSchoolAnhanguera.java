package br.com.will.model;

import lombok.Getter;

public class StudentSchoolAnhanguera {
    @Getter
    private String nome, formacao;
    @Getter
    private int idade, quantidadeDeLinguagens;
    @Getter
    private byte semestreAtual;

    public StudentSchoolAnhanguera(String nome, int idade, String formacao, byte semestreAtual, int quantidadeDeLiguagens) {
        this.nome = nome;
        this.idade = idade;
        this.formacao = formacao;
        this.semestreAtual = semestreAtual;
        this.quantidadeDeLinguagens = quantidadeDeLiguagens;
    }

}
