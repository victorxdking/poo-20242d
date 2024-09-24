import br.edu.fatecfranca.exe0.AtletaBasquete;
import br.edu.fatecfranca.exe0.AtletaVolei;
import br.edu.fatecfranca.exe0.IJogadorBasquete;
import br.edu.fatecfranca.exe0.IJogadorVolei;

public class Main {
    public static void main(String[] args) {
        IJogadorVolei obj1 = new AtletaVolei();
        obj1.levantar();
        obj1.sacar();

        IJogadorBasquete obj2 = new AtletaBasquete();
        obj2.arremessar();
        obj2.cobrarLanceLivre();

        IJogadorBasquete obj3 = new AtletaVolei();
        obj3.levantar();
        obj3.sacar();
    }
}