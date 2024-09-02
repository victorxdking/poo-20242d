package br.edu.fatecfranca.ex2;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int id;
    private String name, area;
    private List<Disciplina> disciplinas;

    public Curso() {
        this.disciplinas = new ArrayList<Disciplina>();
    }
    public Curso(int id, String name, String area) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.disciplinas = new ArrayList<Disciplina>();
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void addDisciplina(int id, String name, String sigla, Professor professor) {
        this.disciplinas.add(new Disciplina(id, name, sigla, professor));
    }

    public void addAluno(Aluno aluno, int idDisciplina) {

        for(Disciplina disciplina : disciplinas) {
            if(disciplina.getId() == idDisciplina) {
                disciplina.addAluno(aluno);
                return;
            }
        }
        System.out.println("Disciplina não existe");
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
