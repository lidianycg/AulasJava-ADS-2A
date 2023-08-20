import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String nome;
		
		System.out.println("Digite o seu nome: ");
		nome = teclado.nextLine(); 
		
		System.out.println("O nome digitado foi: " + nome);
	}

}
