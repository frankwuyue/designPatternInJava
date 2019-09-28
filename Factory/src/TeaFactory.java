
public class TeaFactory implements HotDrinkFactory {

	@Override
	public HotDrink prepare(int amount) {
		System.out.println("This tea is ok and the amount is " + amount);
		return new Tea();
	}

}
