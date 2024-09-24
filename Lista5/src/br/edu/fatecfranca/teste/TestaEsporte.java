package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe0.AtletaVoleiBasquete;


public class TestaEsporte {
    public static void main(String[] args) {

        IJogadorVolei obj1 = new AtletaVolei();
        obj1.levantar();
        obj1.sacar();

        IJogadorBasquete obj2 = new AtletaBasquete();
        obj2.arremessar();
        obj2.cobrarLanceLivre();

        IJogadorVolei obj3 = new AtletaVoleiBasquete();
        obj3.levantar();
        obj3.sacar();

    }
}


