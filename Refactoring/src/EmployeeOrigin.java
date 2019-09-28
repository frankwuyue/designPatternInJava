
public class EmployeeOrigin {
	private int type;
	
	private final int ENGINEER = 1;
	private final int SALESMAN = 2;
	private final int MANAGER = 3;
	 
	private int baseSalary = 10000;
	private int royalty = 100;
	private int bonus = 400;
	 
	public EmployeeOrigin(int type) {
		this.type = type;
	}
	
	public int getEmployeeSalary() {
		int monthSalary = 0;
		switch (type) {
			case ENGINEER:
				monthSalary = baseSalary;
			case SALESMAN:
				monthSalary = baseSalary + royalty;
			case MANAGER:
				monthSalary = baseSalary + bonus;
		}
		return monthSalary;
	}
	
	public int onSalaryHoliday() {
		int holiday = 0;
		switch (type) {
			case ENGINEER:
				holiday = 10;
			case SALESMAN:
				holiday = 12;
			case MANAGER:
				holiday = 15;
		}
		return holiday;
	}
}
