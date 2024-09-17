package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exercicio1.Forum;
import br.edu.fatecfranca.exercicio1.Message;
import br.edu.fatecfranca.exercicio1.Person;

public class MainExercicio1 {
    public static void main(String[] args) {
        Person pessoa1   = new Person(1, "Victor", "Vieira123");
        Person  pessoa2   = new Person(2, "Artur", "Vieia123");
        Person  pessoa3   = new Person(3, "Leonardo", "Henrique123");

        Message mensagem1 = new Message(1,"Boa tarde, senhores!", pessoa1);
        System.out.println(mensagem1);
        Message mensagem2 = new Message(2, "Bora estudar!", pessoa2);
        System.out.println(mensagem2);
        Message mensagem3 = new Message(3, "Seremos grandes programadores!", pessoa3);
        System.out.println(mensagem3);

        Forum forum1 = new Forum(1, "Artur", "https://learn.microsoft.com/pt-br/cpp/cpp/?view=msvc-170");
        forum1.addMessage(mensagem1);
        forum1.addMessage(mensagem2);
        System.out.println(forum1);
    }
}

