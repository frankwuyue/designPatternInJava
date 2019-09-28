package domain.dao;
import java.sql.Connection;
import java.sql.SQLException;

import domain.Employee;

public class EmployeeDAO {
	
	public void saveEmployee(Employee employee) throws SQLException {
//		DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
//		connectionManager.connect();
//		connectionManager.getConnectionObject().prepareStatement("insert into Employee_tb1");
//		connectionManager.disconnect();
		System.out.println("save employee" + employee.getName() + "into database.");
	}
	
	public void deleteEmployee(Employee employee) throws SQLException {
//		DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
//		connectionManager.connect();
//		connectionManager.getConnectionObject().prepareStatement("insert into Employee_tb1");
//		connectionManager.disconnect();
		System.out.println("deleted employee" + employee.getName() + "from database.");
	}
}
