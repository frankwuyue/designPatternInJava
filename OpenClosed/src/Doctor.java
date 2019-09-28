

public class Doctor extends Employee {

	public Doctor(long id, String name, String department, boolean working) {
		super(id, name, department, working);
	}

	
	private void prescribeMedicine() {
		System.out.println("prescribe medicine");
	}
	
	private void diagnosePatient() {
		System.out.println("diagnose patient");
	}


	@Override
	public void performDuties() {
		prescribeMedicine();
		diagnosePatient();
		
	}
}
