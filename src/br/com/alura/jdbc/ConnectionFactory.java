package br.com.alura.jdbc;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	public DataSource dataSource;
	
	public  ConnectionFactory(){
			ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
			comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC");
			comboPooledDataSource.setUser("derivaldo");
			comboPooledDataSource.setPassword("1565Celia@");
			
			comboPooledDataSource.setMaxPoolSize(15);
			
			this.dataSource = comboPooledDataSource;
	}
	
	public Connection recuperarConexao() throws SQLException {
		
		//"jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "derivaldo", "1565Celia@"
		
		return  this.dataSource.getConnection();
		
	}

}
