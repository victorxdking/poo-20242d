package br.edu.fatecfranca.exe4;

public abstract class Coisa {
    protected String nome;

    public Coisa() {
    }

    public Coisa(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract boolean vence(Coisa outraCoisa);

    @Override
    public String toString() {
        return this.nome;
    }
}