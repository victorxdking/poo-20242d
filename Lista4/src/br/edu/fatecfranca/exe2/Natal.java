package br.edu.fatecfranca.exe2;

public class Natal extends CartaoWeb {

    public Natal(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Destinatario: " + destinatario + " Feliz Natal");
    }
}