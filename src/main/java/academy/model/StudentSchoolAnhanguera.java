package academy.model;

import lombok.Getter;

@Getter
public class StudentSchoolAnhanguera {
    private String nome, formacao;
    private int idade, quantidadeDeLinguagens;
    private byte semestreAtual;

    public StudentSchoolAnhanguera(String nome, int idade, String formacao, byte semestreAtual, int quantidadeDeLiguagens) {
        this.nome = nome;
        this.idade = idade;
        this.formacao = formacao;
        this.semestreAtual = semestreAtual;
        this.quantidadeDeLinguagens = quantidadeDeLiguagens;
    }

}
