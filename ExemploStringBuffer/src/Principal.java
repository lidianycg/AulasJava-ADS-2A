
public class Principal {

	public static void main(String[] args) {
		
		String nome = "Lidiany";
		String sobreNome = "Gonçalves";
		String nomeCompleto = nome + sobreNome;
		String nomeComBuffer;
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(nome);
		buffer.append(sobreNome);
		
		nomeComBuffer = buffer.toString();
		
		System.out.println(nomeCompleto);
		System.out.println(nomeComBuffer);

	}

}
