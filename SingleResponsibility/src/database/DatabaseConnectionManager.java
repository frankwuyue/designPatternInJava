package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
	
	private Connection connection;
	
	private static DatabaseConnectionManager INSTANCE = new DatabaseConnectionManager();
	
	public static DatabaseConnectionManager getManagerInstance() {
		return INSTANCE;
	}
	
	public void connect() throws SQLException {
		connection = DriverManager.getConnection("someurl");
		System.out.println("Establishing Database connection.");
	}
	
	public Connection getConnectionObject() {
		return connection;
	}
	
	public void disconnect() throws SQLException {
		connection.close();
		System.out.println("Close Database connection.");
	}
}
