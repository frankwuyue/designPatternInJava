
public class PayrollDepartment implements IOobserver {

	@Override
	public void notifyToDepartment(Employee employee, String msg) {
		System.out.println("PayrollDepartment got notified.");
		System.out.println(msg + " " + employee.getName());
	}

}
