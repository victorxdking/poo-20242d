package br.edu.fatecfranca;

public class TestaAluno {
    public static void main(String[] args) {
        // Criando um objeto da classe Aluno com os dados especificados
        Aluno aluno1 = new Aluno(1234, 27, "Victor", 9, 10);

        // Exibindo os dados do aluno utilizando o método dadosAluno()
        System.out.println(aluno1.dadosAluno());

        // Exibindo a nota final do aluno
        System.out.println("Nota Final: " + aluno1.notaFinal());

        // Verificando se o aluno passou e exibindo o resultado
        System.out.println("Situação: " + aluno1.passou());
    }
}
