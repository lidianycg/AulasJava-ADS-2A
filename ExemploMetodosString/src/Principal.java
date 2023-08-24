
public class Principal {

	public static void main(String[] args) {

		String nome = "Oswaldo Borges";
		String nomeGuerra = "Oswaldo Borges";
		
		String sobreNome = new String("Oswaldo");
		
		if (nome.equals(nomeGuerra))
			System.out.println("Nomes iguais");
		else
			System.out.println("Nomes diferentes");
		
		if (nome.equals(sobreNome))
			System.out.println("Nomes iguais");
		else
			System.out.println("Nomes diferentes");
		
		System.out.println(nome.length());
		System.out.println(nome.toLowerCase());
		System.out.println(nome.toUpperCase());
		System.out.println(nome.charAt(2));
		System.out.println(nome.isEmpty());
		System.out.println(nome.indexOf("al"));
		System.out.println(nome.contains("al"));
		System.out.println(nome.concat(" Peres"));
		System.out.println(nome.equalsIgnoreCase("oswaldo borges"));
		

	}

}
