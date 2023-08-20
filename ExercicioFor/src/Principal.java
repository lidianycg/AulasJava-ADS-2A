import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double nota1, nota2, media;
		Scanner input = new Scanner(System.in);
		
		for(int numAluno = 1;numAluno<=2;numAluno++) {
			System.out.println("Aluno " + numAluno);
		System.out.println("Digite a nota 1: ");
		nota1 = input.nextDouble();
		System.out.println("Digite a nota 2: ");
		nota2 = input.nextDouble();
		media = (nota1 + nota2)/2;
		System.out.println("Média: " + media);
		}


	}

}
