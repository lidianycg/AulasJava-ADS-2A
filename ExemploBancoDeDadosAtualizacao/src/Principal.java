import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Principal {

	public static void main(String[] args) {


		final String usuario = "SYSTEM";
		final String senha = "SYSTEM";
		final String url = "jdbc:oracle:thin:@localhost:1521:xe";
		final String driverBanco = "oracle.jdbc.driver.OracleDriver";
		
		final String instrucaoUpdate = "UPDATE EXEMPLO_2A_PROGEXTREMA SET NOME=? WHERE ID=?";
		
		try {
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(instrucaoUpdate);
			preparedStatement.setString(1, "Rosa");
			preparedStatement.setInt(2, 30);
			
			preparedStatement.executeUpdate();
			
			System.out.println("Alteração realizada com sucesso!");
			
		}catch(Exception exception) {
			exception.printStackTrace();
			
			
		}

	}

}
