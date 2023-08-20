
public class Principal {

	public static void main(String[] args) {

		int[] nota = new int[3];
		
		nota[0] = 9;
		nota[1] = 10;
		nota[2] = 8;
		
		for(int i=0;i<3;i++)
		System.out.println(nota[i]);
		
		//Ou
		
		for(int valor:nota)
			System.out.println(valor);

	}

}
