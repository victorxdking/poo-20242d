<<<<<<< HEAD
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package br.edu.fatecfranca.exe0;

public class Funcionario {
    protected String nome;
    protected String endereco;
    protected String cpf;
    protected float salario;

    public Funcionario() {
        this.nome = "";
        this.endereco = "";
        this.cpf = "";
        this.salario = 0.0F;
    }

    public Funcionario(String nome, String endereco, String cpf, float salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String toString() {
        String var10000 = this.nome;
        return "Funcionario{nome='" + var10000 + "', endereco='" + this.endereco + "', cpf='" + this.cpf + "', salario=" + this.calculaSalario() + "}";
    }

    public float calculaSalario() {
        return this.salario;
    }
}
=======
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package br.edu.fatecfranca.exe0;

public class Funcionario {
    protected String nome;
    protected String endereco;
    protected String cpf;
    protected float salario;

    public Funcionario() {
        this.nome = "";
        this.endereco = "";
        this.cpf = "";
        this.salario = 0.0F;
    }

    public Funcionario(String nome, String endereco, String cpf, float salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String toString() {
        String var10000 = this.nome;
        return "Funcionario{nome='" + var10000 + "', endereco='" + this.endereco + "', cpf='" + this.cpf + "', salario=" + this.calculaSalario() + "}";
    }

    public float calculaSalario() {
        return this.salario;
    }
}
>>>>>>> a89a59d68901f77a0239506b7e543e5a9b87d0eb
