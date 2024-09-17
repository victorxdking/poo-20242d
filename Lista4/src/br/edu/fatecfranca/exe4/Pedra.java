package br.edu.fatecfranca.exe4;

public class Pedra extends Coisa{
    public Pedra() {
        super("Pedra");
    }

    // Pedra vence Tesoura
    @Override
    public boolean vence(Coisa outraCoisa) {
        return outraCoisa instanceof Tesoura;
    }
}