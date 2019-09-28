
public class Main {
	public static void main(String[] args) {
		EmployeeOrigin employeeOrigin = new EmployeeOrigin(1);
		System.out.println(employeeOrigin.getEmployeeSalary());
		System.out.println(employeeOrigin.onSalaryHoliday());
		
		Employee employee = Employee.Create(1);
		System.out.println(employee.getEmployeeSalary());
		System.out.println(employee.onSalaryHoliday());
	}
}
