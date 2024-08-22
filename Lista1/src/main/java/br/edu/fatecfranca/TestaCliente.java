package br.edu.fatecfranca;

public class TestaCliente {
    public static void main(String[] args) {
        // Criando o primeiro cliente (Fulano)
        Cliente fulano = new Cliente(12345, 6789, "Fulano", 1000.0f);

        // Realizando depósito e saque para Fulano
        fulano.realizarDeposito(500.0f);
        fulano.realizarSaque(300.0f);

        // Exibindo as informações do cliente Fulano
        System.out.println(fulano.dadosCliente());

        // Criando o segundo cliente (Beltrano)
        Cliente beltrano = new Cliente(98765, 4321, "Beltrano", 1500.0f);

        // Realizando depósito e saque para Beltrano
        beltrano.realizarDeposito(200.0f);
        beltrano.realizarSaque(100.0f);

        // Exibindo as informações do cliente Beltrano
        System.out.println(beltrano.dadosCliente());
    }
}
