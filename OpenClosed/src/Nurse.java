

public class Nurse extends Employee {

	public Nurse(long id, String name, String department, boolean working) {
		super(id, name, department, working);
	}

	
	private void checkVitalSigns() {
		System.out.println("check vital");
	}
	
	private void drawBlood() {
		System.out.println("draw blood");
	}
	
	private void cleanPatientArea() {
		System.out.println("clean patient area");
	}


	@Override
	public void performDuties() {
		checkVitalSigns();
		drawBlood();
		cleanPatientArea();
	}
}