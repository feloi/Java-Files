import java.util.Locale;
import java.util.Scanner;
import product.product;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        product product = new product();
        System.out.println("Enter product data: ");

        System.out.printf("Name: ");
        product.name = sc.nextLine();
        System.out.printf("Price: ");
        product.price = sc.nextDouble();
        System.out.printf("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);
        sc.close();
    }
}
