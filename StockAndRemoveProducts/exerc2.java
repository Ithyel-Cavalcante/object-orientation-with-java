package Section8pt2;

import java.util.Locale;
import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Produto p1 = new Produto();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        p1.name = input.nextLine();

        System.out.print("Price: ");
        p1.price = input.nextInt();

        System.out.println("Quantity in stock: ");
        p1.qtdEstoque = input.nextInt();

        System.out.println();
        System.out.println("Product Data: " + p1);
        System.out.println();

        System.out.println("Insira o número de produtos à serem adicionados ao estoque: ");
        int quantity = input.nextInt();
        p1.AddItemInStock(quantity);

        System.out.println();
        System.out.println("Updated Data: " + p1);

        System.out.println();
        System.out.println("Insira o número de produtos à serem retirados do estoque: ");
        int quantityRemove = input.nextInt();

        p1.RemoveItemInStock(quantityRemove);

        System.out.println();
        System.out.println("Updated Data: " + p1);




    }
}
