import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Singleton implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Singleton() {
		
	}
	
	private static final Singleton INSTANCE = new Singleton();
	
	public static Singleton getInstance() {
		return INSTANCE;
	}
	
	public int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	static void saveToFile(Singleton singleton, String filename) throws IOException {
		try (FileOutputStream fileOutputStream = new FileOutputStream(filename);
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			objectOutputStream.writeObject(singleton);
		}
	}
	
	static Singleton readFromFile(String filename) throws FileNotFoundException, IOException, ClassNotFoundException {
		try(FileInputStream fileInputStream = new FileInputStream(filename);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			return (Singleton) objectInputStream.readObject();
		}
	}
	
	protected Object readResolve() {
		return INSTANCE;
	}
	
}
