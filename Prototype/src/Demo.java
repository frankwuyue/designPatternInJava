import org.apache.commons.lang3.SerializationUtils;

public class Demo {
	public static void main(String[] args) {
//		Person join = new Person(
//				new String[] {"John","Smith"},
//				new Address("London Street", 123));
//		
//		Person jane = (Person)join.clone();
//		jane.names[0] = "Jane";
//		jane.address.houseNumber = 434;
//		
//		System.out.println(join);
//		System.out.println(jane);
		
//		Employee john = new Employee("John",
//				new AddressWithCountry("Kameido", "Tokyo", "Japan"));
//		Employee jack = new Employee(john);
//		jack.name = "Jack";
//		jack.newAddress = new AddressWithCountry("Ueno", "Tokyo", "Japan");
//		System.out.println(john);
//		System.out.println(jack);
		
		Foo foo = new Foo(331, "life");
		Foo foo2 = SerializationUtils.roundtrip(foo);
		foo2.stuff = 223;
		foo2.whatever = "jinsei";
		
		System.out.println(foo);
		System.out.println(foo2);
	}
}