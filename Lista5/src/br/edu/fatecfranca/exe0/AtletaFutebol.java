package br.edu.fatecfranca.exe0;

public class AtletaFutebol implements IJogadorFutebol{
    @Override
    public void baterPenalti() {
        System.out.println("Atleta futebol penalti ...");
    }

    @Override
    public void baterEscanteio() {
        System.out.println("Atleta futebol escanteio ...");
    }
}
