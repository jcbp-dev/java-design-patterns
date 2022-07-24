package mx.developer.jcbp.creational.singleton;

public class App {
	public static void main(String[] args) {
		DatabaseConnection connection = DatabaseConnection.getInstance();
		connection.connect();
		connection.disconnect();
	}
}
