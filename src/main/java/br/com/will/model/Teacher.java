package br.com.will.model;

public class Teacher  {

    private String name, nameSchool;
    private double salarioPorHora, salarioMensal;
    private int quantidadeDeAlunos;

    public Teacher(String name, String nameSchool, double salarioPorAula, double salarioMensal, int quantidadeDeAlunos){
        this.name = name;
        this.nameSchool = nameSchool;
        this.salarioPorHora = salarioPorAula;
        this.salarioMensal = salarioMensal;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public String getName(){
        return name;
    }

    public String getNameSchool(){
        return nameSchool;
    }

    public double getSalarioPorHora(){
        return salarioPorHora;
    }

    public double getsalarioMensal(){
        return salarioMensal;
    }

    public int getQuantidadeDeAlunos(){
        return quantidadeDeAlunos;
    }
}
