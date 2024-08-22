package br.edu.fatecfranca;

public class TestaRio {
    public static void main(String[] args) {
        // Criando o primeiro rio utilizando o construtor padrão
        Rio rio1 = new Rio();
        // Modificando os atributos através dos métodos
        rio1.chover(5.0f);
        rio1.sujar();
        rio1.mostra();

        // Criando o segundo rio utilizando o construtor sobrecarregado
        Rio rio2 = new Rio("Amazonas", 10.5f, true);
        // Modificando os atributos através dos métodos
        rio2.ensolarar(3.0f);
        rio2.limpar();
        rio2.mostra();
    }
}
