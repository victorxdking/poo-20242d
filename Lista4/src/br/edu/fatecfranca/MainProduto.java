<<<<<<< HEAD
package br.edu.fatecfranca;

import br.edu.fatecfranca.exe4.Produto;
import br.edu.fatecfranca.exe4.Radio;
import br.edu.fatecfranca.exe4.TV;



public class MainProduto {
    public static void main(String[] args) {
        Produto prod;
        prod = new Radio(111, 222, 96.5f, "FM");
        prod.testaUnidade();
        System.out.println(prod); // chama toString() da classe Radio

        prod = new TV(888, 999, 539);
        prod.testaUnidade();
        System.out.println(prod); // chama toString() da classe TV
    }
}
=======
package br.edu.fatecfranca;

import br.edu.fatecfranca.exe4.Produto;
import br.edu.fatecfranca.exe4.Radio;
import br.edu.fatecfranca.exe4.TV;



public class MainProduto {
    public static void main(String[] args) {
        Produto prod;
        prod = new Radio(111, 222, 96.5f, "FM");
        prod.testaUnidade();
        System.out.println(prod); // chama toString() da classe Radio

        prod = new TV(888, 999, 539);
        prod.testaUnidade();
        System.out.println(prod); // chama toString() da classe TV
    }
}
>>>>>>> a89a59d68901f77a0239506b7e543e5a9b87d0eb
