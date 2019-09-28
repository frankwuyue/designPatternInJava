import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Singleton singleton = Singleton.getInstance();
//		singleton.setValue(123);
//		System.out.println(singleton.getValue());
//		String filename = "singleton";
//		
//		Singleton.saveToFile(singleton, filename);
//		
//		singleton.setValue(333);
//		Singleton singleton2 = Singleton.readFromFile(filename);
//		System.out.println(singleton == singleton2);
//		System.out.println(singleton.getValue());
//		System.out.println(singleton2.getValue());
		
		Printer printer = Printer.getInstance(Subsystem.PRIMARY);
		Printer aux = Printer.getInstance(Subsystem.AUXILIARY);
		Printer aux2 = Printer.getInstance(Subsystem.AUXILIARY);
		Printer aux3 = Printer.getInstance(Subsystem.AUXILIARY);
	}
}
