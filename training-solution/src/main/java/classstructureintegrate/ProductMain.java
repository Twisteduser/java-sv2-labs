package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scannerProduct = new Scanner(System.in);

        System.out.println("Please enter the product name: ");
        String name = scannerProduct.nextLine();

        System.out.println("Please enter the product price: ");
        int price = scannerProduct.nextInt();

        Product product = new Product(name,price);
        System.out.println(product.getName() + " " + product.getPrice());

        product.increasePrice(10);
        System.out.println(product.getName() + " " + product.getPrice());

        product.decreasePrice(20);
        System.out.println(product.getName() + " " + product.getPrice());
    }
}
