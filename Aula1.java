import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Aula1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma, a, b;

        System.out.println("Digite um número: \n");
       a = input.nextInt();

        System.out.println("Digite um segundo número: ");
       b = input.nextInt();

       soma = a + b;
        System.out.println("Hello, world");
        System.out.println("A soma dos dois numeros é: "+soma);

    }
    }