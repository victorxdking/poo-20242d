package br.edu.fatecfranca.exe0;

public class AtletaVolei implements IJogadorVolei {

    @Override
    public void sacar() {
        System.out.println("Jogador de volei sacando ...");
    }

    @Override
    public void levantar() {
        System.out.println("Jogador de volei levantando ...");
    }
}