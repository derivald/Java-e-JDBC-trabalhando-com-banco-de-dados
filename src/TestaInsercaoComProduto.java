import java.sql.Connection;
import java.sql.SQLException;

import br.com.alura.jdbc.ConnectionFactory;
import br.com.alura.jdbc.dao.ProdutoDAO;
import br.com.alura.jdbc.modelo.Produto;

public class TestaInsercaoComProduto {

	public static void main(String[] args) throws SQLException {

		Produto comoda = new Produto("Cômoda", "Cômoda Vertical");

		try (Connection connection = new ConnectionFactory().recuperarConexao()) {
			ProdutoDAO ProdutoDAO = new ProdutoDAO(connection);
			ProdutoDAO.salvar(comoda);
			//Lista = persistenciaProduto.listar();

		}
		

	}

}
