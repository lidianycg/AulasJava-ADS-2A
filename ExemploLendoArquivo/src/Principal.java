import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		String nome = "C:\\Users\\lidia\\Documents\\teste.txt";
		
		System.out.printf("\nConteúdo do arquivo texto:\n");
		try {
			FileReader arq = new FileReader(nome);
			BufferedReader lerArq = new BufferedReader(arq);
			
			String linha = lerArq.readLine(); //lê a primeira linha
			while (linha != null) {
				System.out.println(linha);
				linha = lerArq.readLine(); // lê da segunda até a última linha
			}
			
			arq.close();
		} catch (IOException e) {
			System.out.printf("Erro na abertura do arquivo: %s. \n", e.getMessage());
		}
		System.out.println();
	}

}
