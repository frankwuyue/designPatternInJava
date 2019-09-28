import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement implements ISubject {
	private EmployeeDAO dao = new EmployeeDAO();
	private List<IOobserver> oobservers = new ArrayList<IOobserver>();
	
	private String msg;
	
	public void hireNewEmployee(Employee employee) {
		dao.addEmployee(employee);
		msg = "New Hire: ";
		notifyOberservers(employee, msg);
	}
	
	public void changeEmployeeName(int id, String name) {
		Employee employee = dao.getEmployee(id);
		if (employee != null) {
			dao.changeEmployeeName(employee, name);
			msg = "Name Changed to: ";
			notifyOberservers(employee, msg);
		}
	}
	
	/* (non-Javadoc)
	 * @see ISubject#notifyOberservers()
	 */
	@Override
	public void notifyOberservers(Employee employee, String msg) {
		for (IOobserver iOobserver : oobservers) {
			iOobserver.notifyToDepartment(employee, msg);
		}
	}
	
	/* (non-Javadoc)
	 * @see ISubject#registerOberserver(IOobserver)
	 */
	@Override
	public void registerOberserver(IOobserver oobserver) {
		oobservers.add(oobserver);
	}
	
	/* (non-Javadoc)
	 * @see ISubject#removeOberserver(IOobserver)
	 */
	@Override
	public void removeOberserver(IOobserver oobserver) {
		if (oobservers.contains(oobserver)) {
			oobservers.remove(oobserver);
		} else {
			System.out.println("the obeserver doesnot registered yet.");
		}
	}
}
