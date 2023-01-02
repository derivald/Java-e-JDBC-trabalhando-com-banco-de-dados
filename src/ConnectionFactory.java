import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	Connection recuperarConexao() throws SQLException {
		return  DriverManager
				.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "derivaldo", "1565Celia@");
		
	}

}
