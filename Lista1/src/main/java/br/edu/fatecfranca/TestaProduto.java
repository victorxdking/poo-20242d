package br.edu.fatecfranca;

public class TestaProduto {
    public static void main(String[] args) {
        // Criando o primeiro produto utilizando o construtor padrão
        Produto produto1 = new Produto();
        // Modificando os atributos através dos métodos
        produto1.comprar(10);
        produto1.subir(2.5f);
        produto1.mostra();

        // Criando o segundo produto utilizando o construtor sobrecarregado
        Produto produto2 = new Produto(2, "Caneta", 100, 1.5f);
        // Modificando os atributos através dos métodos
        produto2.vender(30);
        produto2.descer(0.5f);
        produto2.mostra();
    }
}
