
public class EmergencyRoomProcess {
	public static void main(String args[]) {
		
		HospitalManagement director = new HospitalManagement();
		Employee peggy = new Nurse(0, "peggy", "nurse", true);
		
		director.callUpon(peggy);
		
		Employee suzan = new Doctor(1, "suzan", "doctor", true);
		director.callUpon(suzan);
	}
}
