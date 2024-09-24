package br.edu.fatecfranca.exe1;

public class Pessoa extends Animal implements Cidadao, Contribuinte, Professor {
    // extends Animal é herança de código fonte
    // implements Cidadao, Contribuinte, Professor é herança de comportamento
    @Override
    public void vota() {
        System.out.println("Pessoa votando...");
    }

    @Override
    public void tiraRg() {
        System.out.println("Pessoa tirando RG...");
    }

    @Override
    public void pagaIR() {
        System.out.println("Pessoa pagando IR...");
    }

    @Override
    public void tiraCPF() {
        System.out.println("Pessoa tirando CPF...");
    }

    @Override
    public void ensina() {
        System.out.println("Pessoa ensinando...");
    }

    @Override
    public void trabalha() {
        System.out.println("A pessoa está trabalhando...");
    }
}
