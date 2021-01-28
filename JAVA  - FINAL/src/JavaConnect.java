// LEANDRO PEREIRA DOS SANTOS CB3005372
// RENAN JOSUÉ SILVA DE MATOS CB3007162

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaConnect {

		String url = "jdbc:sqlserver://localhost:1433;databaseName=alunos";
		String user = "renanleandro";
		String password = "renanleandro";

		public Connection getConnection() {
			try {
				return DriverManager.getConnection(url, user, password);				
			}			
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	
	}
}		

