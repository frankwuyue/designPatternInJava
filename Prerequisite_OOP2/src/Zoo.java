
public class Zoo {
	public static void main(String args[]) {
		
		Bird bird1 = new Bird(1, "F", 2);
		bird1.eat();
		
		Sparrow sparrow = new Sparrow(34, "M", 3);
		sparrow.fly();
		
		Flyable flyable = new Sparrow(0, "M", 10);
	}
}
