import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {

	public static void main(String[] args) {


		final String usuario = "SYSTEM";
		final String senha = "SYSTEM";
		final String url = "jdbc:oracle:thin:@localhost:1521:xe";
		final String driverBanco = "oracle.jdbc.driver.OracleDriver";
		
		final String instrucaoSelect = "SELECT * FROM EXEMPLO_2A_PROGEXTREMA";
		
		try {
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			
			PreparedStatement preparedStatement = conexao.prepareStatement(instrucaoSelect);

			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()){
				int id = rs.getInt("ID");
				String nome = rs.getString("NOME");
				System.out.println("ID: " + id + " - NOME: " + nome);
			}
			
			System.out.println("Consulta realizada com sucesso");			
		}catch(Exception exception) {
			exception.printStackTrace();
			
			
		}
	}

}
