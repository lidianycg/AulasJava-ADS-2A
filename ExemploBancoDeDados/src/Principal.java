import java.sql.Connection;
import java.sql.DriverManager;

public class Principal {

	public static void main(String[] args) {


		final String usuario = "SYSTEM";
		final String senha = "SYSTEM";
		final String url = "jdbc:oracle:thin:@localhost:1521:xe";
		final String driverBanco = "oracle.jdbc.driver.OracleDriver";
		
		
		try {
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
					
			System.out.println("Conexão realizada com sucesso!");
					
		}catch(Exception exception) {
			System.out.println("Erro na conexão com o Banco de Dados");
			//System.out.println(exception);
			
			
		}

	}

}
