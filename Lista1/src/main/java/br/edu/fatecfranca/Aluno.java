package br.edu.fatecfranca;

public class Aluno {
    public int nroAluno, idade;
    public String nome;
    public float p1, p2;

    // Construtor padrão
    public Aluno() {
    }

    // Construtor sobrecarregado
    public Aluno(int nroAluno, int idade, String nome, float p1, float p2) {
        this.nroAluno = nroAluno;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }

    // Método para calcular a nota final
    public float notaFinal() {
        return (this.p1 + this.p2) / 2;
    }

    // Método para retornar os dados do aluno
    public String dadosAluno() {
        return "Nro aluno: " + this.nroAluno + ", Nome: " + this.nome + ", Idade: " + this.idade;
    }

    // Método para verificar se o aluno passou
    public String passou() {
        return this.notaFinal() >= 6 ? "Aprovado" : "Reprovado";
    }

    // Sobrescrevendo o método toString() para exibir as informações do aluno
    public String toString() {
        return this.dadosAluno() + "\nMédia: " + this.notaFinal() + "\nSituação: " + this.passou();
    }
}
