
public class Principal {

	public static void main(String[] args) {

		Aluno objeto = new Aluno();
		
		objeto.nome = "Lidiany";
		objeto.matricula = "C98HEJ7";
		objeto.teste = 9;
		objeto.prova = 8;
		
		System.out.println(objeto.obterMedia());

		
	}

}
