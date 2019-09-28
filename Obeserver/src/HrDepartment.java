
public class HrDepartment implements IOobserver {

	@Override
	public void notifyToDepartment(Employee employee, String msg) {
		System.out.println("HrDepartment got notified.");
		System.out.println(msg + " " + employee.getName());
	}

}
