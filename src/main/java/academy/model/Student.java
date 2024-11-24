package academy.model;

public class Student {
    private String name, formacao;
    private int commit, quantidadeDeLinguagens;

    public Student(String name, int commitsrealizados, String formacao, int linguagensDeProgramacao) {
        this.name = name;
        this.commit = commitsrealizados;
        this.formacao = formacao;
        this.quantidadeDeLinguagens = linguagensDeProgramacao;
    }

    public String getName() {
        return name;
    }

    public int getCommit() {
        return commit;
    }

    public String getFormacao() {
        return formacao;
    }

    public int getQtdLinguagem() {
        return quantidadeDeLinguagens;
    }
}
