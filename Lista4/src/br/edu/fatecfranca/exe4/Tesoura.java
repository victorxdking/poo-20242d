package br.edu.fatecfranca.exe4;

public class Tesoura extends Coisa{
    public Tesoura() {
        super("Tesoura");
    }

    // Tesoura vence Papel
    @Override
    public boolean vence(Coisa outraCoisa) {
        return outraCoisa instanceof Papel;
    }
}