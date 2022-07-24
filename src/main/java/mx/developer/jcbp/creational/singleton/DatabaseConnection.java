package mx.developer.jcbp.creational.singleton;

public class DatabaseConnection {
	
	private static DatabaseConnection instance;
	
	private DatabaseConnection() {
		
	}
	
	
	public static DatabaseConnection getInstance() {
		if(instance==null) {
			instance = new DatabaseConnection();
		}
		return instance;
	}
	
	public void  connect() {
		System.out.println("Success Connection!!!");
	}
	
	public void disconnect() {
		System.out.println("Success Disconnection!!!");
	}

}
