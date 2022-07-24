package mx.developer.jcbp.creational.factory;

public class AppClazz {

	public static void main(String[] args) {
		String host = "http://12.34.56.234";
		String port = "5432";
		String user = "developer.usr@database.io";
		String password = "%5oy31#c0nBoot";
		ConnectionFactory factory = new ConnectionFactory();
		
		Connection connection = factory.getConnection("ORACLE", host, port, user, password);
		connection.connect();
		connection.disconnect();
		
		System.out.println("==========================");
		
		connection = factory.getConnection("MYSQL", host, port, user, password);		
		connection.connect();
		connection.disconnect();
		
		System.out.println("==========================");
		connection = factory.getConnection(null, host, port, user, password);
		connection.connect();
	}
}
