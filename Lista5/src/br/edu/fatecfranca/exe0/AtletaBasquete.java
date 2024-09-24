package br.edu.fatecfranca.exe0;

public class AtletaBasquete implements IJogadorBasquete {
    @Override
    public void arremessar() {
        System.out.println("Atleta basteque arremessou");
    }

    @Override
    public void cobrarLanceLivre() {
        System.out.println("Atleta basteque cobrou Lance Livre");
    }
}
