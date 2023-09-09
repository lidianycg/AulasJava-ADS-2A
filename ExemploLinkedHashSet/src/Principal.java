import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Integer> numerosArraylist = new ArrayList<>();
		numerosArraylist.add(8);
		numerosArraylist.add(5);
		numerosArraylist.add(8);
		System.out.println("ArrrayList: " + numerosArraylist);
		
		LinkedHashSet<Integer> numerosLinkedHashSet = new LinkedHashSet<>(numerosArraylist);
		System.out.println("LinkedHashSet: " + numerosLinkedHashSet);


	}

}
