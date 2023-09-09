import java.util.Scanner;
import java.util.InputMismatchException;


public class Principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int valor;
		
		try {
			
			System.out.println("Digite o numerador: ");
			valor = scanner.nextInt();
			
			int resultado = valor/3;
			System.out.println(resultado);
		}
		
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("InputMismatchException => " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Exception => " + e.getMessage());
		}
		finally {
			System.out.println("Fim");
		}
	}
	
}
