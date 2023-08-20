import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int option;

		do {
			
			System.out.println("---------------");
			System.out.println("Menu Principal");
			System.out.println("---------------");
			System.out.println("Selecione uma das opções abaixo:");
			System.out.println("1 - Aluno");
			System.out.println("2 - Professor");
			System.out.println("3 - Coordenador");
			System.out.println("0 - Sair");
			
			System.out.println("Escolha uma opção: ");
			option = teclado.nextInt();
			
			
			switch(option) {
			
			case 1:
				System.out.println("Você selecionou a opção: Aluno");
				break;
			case 2:
				System.out.println("Você selecionou a opção: Professor");
				break;
			case 3:
				System.out.println("Você selecionou a opção: Coordenador");
				break;
			case 0:
				System.out.println("Atendimento finalizado");
				break;
			
			default:
				System.out.println("Você selecionou uma opção inválida");
				
			}
				
		} while(true);

	}

}