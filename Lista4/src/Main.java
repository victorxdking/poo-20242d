import br.edu.fatecfranca.exe0.Assistente;

public class Main {
    public static void main(String[] args) {

        Assistente ass1 = new Assistente("Pedro", "Franca", "123.456.789-0", 3000, 8);

        System.out.println();
        System.out.println(ass1.calculaSalario());
    }
}