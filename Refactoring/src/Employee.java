
public abstract class Employee {
	private final static int ENGINEER = 1;
	private final static int SALESMAN = 2;
	private final static int MANAGER = 3;
	
	protected int baseSalary = 10000;
	protected int royalty = 100;
	protected int bonus = 400;
	
	abstract int getEmployeeSalary();
	abstract int onSalaryHoliday();
	
	public static Employee Create(int type) {
		Employee employee = null;
		switch (type) {
			case ENGINEER:
				employee = new Engineer(); 
				break;
			case SALESMAN:
				employee = new Salesman();
			case MANAGER:
				employee = new Manager();
				break;
		}
		return employee;
	}
}
