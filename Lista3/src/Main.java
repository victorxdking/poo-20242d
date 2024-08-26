import br.edu.fatecfranca.ex0.CarItem;
import br.edu.fatecfranca.ex0.Product;

public class Main {
    public static void main(String[] args) {

        Product prod1 = new Product(1, "Monitor", 600);
        Product prod2 = new Product(2, "Teclado", 140);
        Product prod3 = new Product(3, "Mouse", 90);

        CarItem carItem1 = new CarItem(1, 5, prod1);
        System.out.println(carItem1);

        CarItem carItem2 = new CarItem(2, 5, prod1);
        System.out.println(carItem2);

        CarItem carItem3 = new CarItem(3, 10, prod2);
        System.out.println(carItem3);

        CarItem carItem4 = new CarItem(4, 15, prod2);
        System.out.println(carItem4);

        CarItem carItem5 = new CarItem(5, 20, prod3);
        System.out.println(carItem5);

    }
}