
public class Principal {

    public static void main(String[] args) {

        String[] objetos = {"garrafa", "copo", "litro"};

        for (int tam = objetos.length - 1; tam >= 0; tam--) {
            System.out.print(objetos[tam] + " ");
        }

    }
}