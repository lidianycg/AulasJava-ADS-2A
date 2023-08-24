import discentes.AlunoSuperior;

public class Principal {

	public static void main(String[] args) {
		
		AlunoSuperior aluno = new AlunoSuperior();
		aluno.setNome("Deniel");
		aluno.setTeste(9);
		aluno.setProva(10);
		
		System.out.print(aluno.getMedia());

	}

}
