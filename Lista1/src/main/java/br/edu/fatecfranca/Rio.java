package br.edu.fatecfranca;

public class Rio {
    private String nome;
    private float nivel;
    private boolean poluido;

    // Construtor padrão (sem parâmetros)
    public Rio() {
        this.nome = "";
        this.nivel = 0.0f;
        this.poluido = false;
    }

    // Construtor sobrecarregado (com parâmetros)
    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    // Método para aumentar o nível do rio
    public void chover(float quantidade) {
        this.nivel += quantidade;
    }

    // Método para diminuir o nível do rio
    public void ensolarar(float quantidade) {
        if (quantidade <= this.nivel) {
            this.nivel -= quantidade;
        } else {
            System.out.println("Nível do rio não pode ser negativo.");
        }
    }

    // Método para limpar o rio (remover a poluição)
    public void limpar() {
        this.poluido = false;
    }

    // Método para poluir o rio
    public void sujar() {
        this.poluido = true;
    }

    // Método para exibir todas as informações do rio
    public void mostra() {
        System.out.println("Nome do Rio: " + this.nome);
        System.out.println("Nível do Rio: " + this.nivel + " metros");
        System.out.println("Está Poluído? " + (this.poluido ? "Sim" : "Não"));
    }
}
