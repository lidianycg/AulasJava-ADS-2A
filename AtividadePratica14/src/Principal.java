import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    
        ArrayList<Integer> numeros = new ArrayList<>();

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros: ");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        scanner.close();

        System.out.println("Números armazenados na lista:");
        for (int num : numeros) {
            System.out.println(num);
        }

        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }

        System.out.println("Soma total dos números: " + soma);
    }
}