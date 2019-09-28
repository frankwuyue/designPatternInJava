
public class Salesman extends Employee{

	@Override
	int getEmployeeSalary() {
		return baseSalary + royalty;
	}

	int onSalaryHoliday() {
		return 12;
	}

}
