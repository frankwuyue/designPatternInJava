package clients;
import java.sql.SQLException;

import domain.Employee;
import domain.dao.EmployeeDAO;
import enums.FormatType;
import reporting.EmployeeReportFormatter;

public class ClientModule {
	public static void hireNewEmployee(Employee employee) throws SQLException {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.saveEmployee(employee);
	}
	
	public static void terminateEmployee(Employee employee) throws SQLException {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.deleteEmployee(employee);
	}
	
	public static void printEmployee(Employee employee, FormatType formatType) {
		EmployeeReportFormatter employeeReportFormatter = new EmployeeReportFormatter(employee, formatType);
		System.out.println(employeeReportFormatter.getFormattedEmployee());
	}
	
	public static void main(String[] args) throws SQLException {
		Employee peggy = new Employee(0, "peggy", "Mechanical Dept.", true);
		ClientModule.hireNewEmployee(peggy);
		ClientModule.printEmployee(peggy, FormatType.CSV);
	}
}
