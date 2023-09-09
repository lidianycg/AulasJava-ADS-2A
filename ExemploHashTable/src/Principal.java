import java.util.Hashtable;

public class Principal {

	public static void main(String[] args) {

		Hashtable<Integer, String> linguagensProgramacao = new Hashtable<>();
		linguagensProgramacao.put(1, "C++");
		linguagensProgramacao.put (2, "Java");
		linguagensProgramacao. put(3, "Cobol");
		System.out.println("Conteúdo do HashTable: " + linguagensProgramacao);
		
		String valor = linguagensProgramacao. get(2);
		System.out.println("Elemento da chave 2: " + valor);
		
	}

}
