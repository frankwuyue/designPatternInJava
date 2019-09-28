import java.util.Date;

public class Employee {
	private String name;
	private Date hireDate;
	private int salary;
	private boolean working = false;
	
	public int employeeId;
	
	private static int COUNTER;

	public Employee(String name, Date hireDate, int salary, boolean working) {
		this.name = name;
		this.hireDate = hireDate;
		this.salary = salary;
		this.working = working;
		
		employeeId = COUNTER++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}
	
	
}
