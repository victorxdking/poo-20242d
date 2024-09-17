package br.edu.fatecfranca.exe2;

public class Aniversario extends CartaoWeb {
    public Aniversario(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Destinatario: " + destinatario + " Feliz Aniversario");
    }
}