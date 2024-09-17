package br.edu.fatecfranca.exe2;

public class DiaDosNamorados extends CartaoWeb {


    public DiaDosNamorados(String destinatario) {

        super(destinatario);
    }

    @Override
    public void showMessage() {

        System.out.println("Destinatario: " + destinatario + " Feliz dia dos namorados");
    }
}