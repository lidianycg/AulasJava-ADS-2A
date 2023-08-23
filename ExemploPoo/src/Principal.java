
public class Principal {

	public static void main(String[] args) {

		AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
		Professor professor = new Professor();
		AlunoEnsinoSuperior alunoEnsinoSuperior = new AlunoEnsinoSuperior();
		
		alunoEnsinoMedio.setNome("Lidiany");
		alunoEnsinoMedio.matricula = "C98HEJ7";
		alunoEnsinoMedio.teste = 9;
		alunoEnsinoMedio.prova = 8;
		
		System.out.println("Aluno do ensino médio:");
		System.out.println(alunoEnsinoMedio.getNome());
		System.out.println(alunoEnsinoMedio.getMedia());
		
		alunoEnsinoSuperior.setNome("Lucas");
		alunoEnsinoSuperior.matricula = "C33FAL8";
		alunoEnsinoSuperior.teste = 6;
		alunoEnsinoSuperior.prova = 8;
		
		System.out.println("Aluno do ensino superior:");
		System.out.println(alunoEnsinoSuperior.getNome());
		System.out.println(alunoEnsinoSuperior.getMedia());

		professor.setNome("Carlos");
		professor.setSalario(1000);
		
		System.out.println(professor.getNome());
		System.out.println(professor.getInss());
		System.out.println(professor.getSalarioLiquido());
		
		
		
	}

}
