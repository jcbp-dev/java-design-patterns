package mx.developer.jcbp.creational.factory;

public class PostgreSQLConnection implements Connection{
	
	private String host;
	
	private String port;
	
	private String user;
	
	private String password;
	
	

	public PostgreSQLConnection(String host, String port, String user, String password) {
		super();
		this.host = host;
		this.port = port;
		this.user = user;
		this.password = password;
	}

	public void connect() {
		System.out.printf("Success connection to PostgreSQL Server: { Host: %s, Port: %s, User: %s } \n", this.host, this.port, this.user);
	}

	public void disconnect() {
		System.out.printf("Success Disconnection from PostgreSQL Server \n");
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
