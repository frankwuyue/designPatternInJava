import java.util.HashMap;

public class Printer {
	
	private static int instanceCount = 0;
	
	private Printer() {
		instanceCount ++;
		System.out.println("totoal count of " + instanceCount + "are created.");
	}
	
	private static HashMap<Subsystem, Printer> instances = new HashMap<>();
	public static Printer getInstance(Subsystem ss) {
		if (instances.containsKey(ss)) {
			return instances.get(ss);
		} else {
			Printer instance = new Printer();
			instances.put(ss, instance);
			return instance;
		}
	}
}
