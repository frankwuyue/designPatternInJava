
public class CoffeeFactory implements HotDrinkFactory {

	@Override
	public HotDrink prepare(int amount) {
		System.out.println("This coffee is good, the amount is " + amount);
		return new Coffee();
	}

}
