<<<<<<< HEAD
package br.edu.fatecfranca.exe0;

public class Gerente extends Funcionario {
    private float bonus;

    public Gerente() {
        super(); // chama o construtor sem parâmetro da superclasse
    }

    public Gerente(String nome, String endereco, String cpf, float salario, float bonus) {
        super(nome, endereco, cpf, salario);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBônus: " + bonus;
    }

    // Alteração aqui: o nome do método agora é calculaSalario
    @Override
    public float calculaSalario() {
        return this.salario + this.bonus * 40.0f;
    }
}
=======
package br.edu.fatecfranca.exe0;

public class Gerente extends Funcionario {
    private float bonus;

    public Gerente() {
        super(); // chama o construtor sem parâmetro da superclasse
    }

    public Gerente(String nome, String endereco, String cpf, float salario, float bonus) {
        super(nome, endereco, cpf, salario);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBônus: " + bonus;
    }

    // Alteração aqui: o nome do método agora é calculaSalario
    @Override
    public float calculaSalario() {
        return this.salario + this.bonus * 40.0f;
    }
}
>>>>>>> a89a59d68901f77a0239506b7e543e5a9b87d0eb
