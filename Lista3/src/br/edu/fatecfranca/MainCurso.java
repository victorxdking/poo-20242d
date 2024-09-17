package br.edu.fatecfranca;

import br.edu.fatecfranca.ex2.Aluno;
import br.edu.fatecfranca.ex2.Curso;
import br.edu.fatecfranca.ex2.Professor;

public class MainCurso {
    public static void main(String[] args) {
        Aluno al1 = new Aluno(1, "Paulo", "paulo");
        Aluno al2 = new Aluno(2, "Pedro", "pedro");
        Aluno al3 = new Aluno(3, "Lucas", "lucas");
        Professor prof1 = new Professor(1, "Daniel", "daniel");
        Professor prof2 = new Professor(2, "Carlão", "carlao");

        Curso cur1 = new Curso(1,"ADS", "Exatas");
        cur1.addDisciplina(1,"POO","ILP007", prof1);
        cur1.addAluno(al1, 1);
        cur1.addAluno(al1, 1);
        cur1.addAluno(al1, 1);
        System.out.println(cur1);
    }
}
