import java.util.Date;

public class App {
	public static void main(String args[]) {
		Employee employee = new Employee("house", new Date(20190809L), 35000000, true);
		EmployeeManagement employeeManagement = new EmployeeManagement();
		
		IOobserver hrIOobserver = new HrDepartment();
		IOobserver pIOobserver = new PayrollDepartment();
		
		employeeManagement.registerOberserver(hrIOobserver);
		employeeManagement.registerOberserver(pIOobserver);
		
		employeeManagement.hireNewEmployee(employee);
		
		employeeManagement.changeEmployeeName(4, "sarah");
	}
}
