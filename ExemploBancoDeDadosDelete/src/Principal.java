import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Principal {

	public static void main(String[] args) {


		final String usuario = "SYSTEM";
		final String senha = "SYSTEM";
		final String url = "jdbc:oracle:thin:@localhost:1521:xe";
		final String driverBanco = "oracle.jdbc.driver.OracleDriver";
		
		final String instrucaoDelete = "DELETE FROM EXEMPLO_2A_PROGEXTREMA WHERE ID = ?";
		
		try {
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			
			PreparedStatement preparedStatement = conexao.prepareStatement(instrucaoDelete);
			preparedStatement.setInt(1, 30);
			
			preparedStatement.executeUpdate();
			
			System.out.println("Exclusão realizada com sucesso");		
					
		}catch(Exception exception) {
			exception.printStackTrace();
			
			
		}
	}

}
