
public class Principal {

	public static void main(String[] args) {
		
		int numero = 1;
		
		switch(numero) {
		
		case 1:
		case 2:
			System.out.println("Você digitou 1 ou 2");
			break;
		case 3:
			System.out.println("Você digitou 3");
			
		default:
			System.out.println("Você digitou um valor inválido.");
			
		}

	}

}
