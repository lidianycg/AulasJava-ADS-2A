
public class Principal {

	public static void main(String[] args) {
		try {
		    return a / b;
		} catch (RuntimeException e) {
		    return -1;
		} catch (ArithmeticException e) {
		    return 0;
		} finally {
		    System.out.print("concluído");
		}
	}

}
