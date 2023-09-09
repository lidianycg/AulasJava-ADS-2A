import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Principal {

	public static void main(String[] args) {


		final String usuario = "SYSTEM";
		final String senha = "SYSTEM";
		final String url = "jdbc:oracle:thin:@localhost:1521:xe";
		final String driverBanco = "oracle.jdbc.driver.OracleDriver";
		
		final String instrucao_insert = "INSERT INTO EXEMPLO_2A_PROGEXTREMA(ID, NOME) VALUES(?,?)";
		
		try {
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(instrucao_insert);
			preparedStatement.setInt(1, 50);
			preparedStatement.setString(2, "Lidiane");
			
			preparedStatement.executeUpdate();
			
			System.out.println("Inclusão realizada com sucesso!");
			
		}catch(Exception exception) {
			exception.printStackTrace();
			
			
		}

	}

}
