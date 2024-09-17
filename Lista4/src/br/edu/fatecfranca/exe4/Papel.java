package br.edu.fatecfranca.exe4;

public class Papel extends Coisa{

    public Papel() {
        super("Papel");
    }

    // Papel vence Pedra
    @Override
    public boolean vence(Coisa outraCoisa) {
        return outraCoisa instanceof Pedra;
    }
}