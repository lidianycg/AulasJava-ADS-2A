import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Principal {

	public static void main(String[] args)throws IOException {
		Scanner teclado = new Scanner (System.in);
		String matricula;
		String nome;
		double teste, prova;
		int faltas;
		
		FileWriter arq = new FileWriter("C:\\Users\\lidia\\Documents\\teste.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		System.out.println("Digite sua matrícula: ");
		matricula = teclado.next();
		
		System.out.println("Digite seu nome: ");
		nome = teclado.next();
		
		System.out.println("Digite seu teste: ");
		teste = teclado.nextDouble();
		
		System.out.println("Digite sua prova: ");
		prova = teclado.nextDouble();
		
		System.out.println("Digite suas faltas: ");
		faltas = teclado.nextInt();
		
		gravarArq.println(matricula);
		gravarArq.println(nome);
		gravarArq.println(teste);
		gravarArq.println(prova);
		gravarArq.println(faltas);
		
		arq.close();
		
		System.out.println("Gravação efetuada com sucesso");
   }

}
