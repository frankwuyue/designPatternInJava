
public class Manager extends Employee{

	@Override
	int getEmployeeSalary() {
		return baseSalary + bonus;
	}

	int onSalaryHoliday() {
		return 15;
	}

}
