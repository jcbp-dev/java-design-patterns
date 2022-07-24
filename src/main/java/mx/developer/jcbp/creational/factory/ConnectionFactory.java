package mx.developer.jcbp.creational.factory;

public class ConnectionFactory {

	public Connection getConnection(String connectionType, String host, String port, String user, String password) {
		if(connectionType == null)
			return new DefaultConnection(host, port, user, password);
		if(connectionType.equalsIgnoreCase("MYSQL"))
			return new MySQLConnection(host, port, user, password);
		if(connectionType.equalsIgnoreCase("ORACLE"))
			return new OracleConnection(host, port, user, password);
		if(connectionType.equalsIgnoreCase("POSTGRE"))
			return new PostgreSQLConnection(host, port, user, password);
		if(connectionType.equalsIgnoreCase("SQL"))
			return new SQLServerConnection(host, port, user, password);
		return new DefaultConnection(host, port, user, password);
	}
}
