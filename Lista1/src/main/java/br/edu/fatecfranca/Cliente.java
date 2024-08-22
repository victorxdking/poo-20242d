package br.edu.fatecfranca;

public class Cliente {
    private int numeroConta;
    private int numeroAgencia;
    private String nome;
    private float saldo;

    // Construtor padrão
    public Cliente() {
        this.numeroConta = 0;
        this.numeroAgencia = 0;
        this.nome = "";
        this.saldo = 0.0f;
    }

    // Construtor sobrecarregado
    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    // Método para realizar depósito
    public void realizarDeposito(float valor) {
        this.saldo += valor;
    }

    // Método para realizar saque
    public void realizarSaque(float valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    // Método para retornar o número da conta, nome do cliente e saldo atual
    public String dadosCliente() {
        return "Número da Conta: " + this.numeroConta + ", Nome: " + this.nome + ", Saldo Atual: R$ " + this.saldo;
    }
}
