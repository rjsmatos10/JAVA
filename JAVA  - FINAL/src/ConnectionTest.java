// LEANDRO PEREIRA DOS SANTOS CB3005372
// RENAN JOSUÉ SILVA DE MATOS CB3007162

import java.sql.Connection; 
import java.sql.SQLException; 

public class ConnectionTest {     
    public static void main(String[] args) throws SQLException {
         Connection connection = new JavaConnect().getConnection();
         System.out.println("Conexao OK");
         connection.close();
     }
}