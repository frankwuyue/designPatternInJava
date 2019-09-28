
public class Employee {
	public String name;
	public AddressWithCountry newAddress;
	public Employee(String name, AddressWithCountry newAddress) {
		this.name = name;
		this.newAddress = newAddress;
	}
	
	public Employee(Employee other) {
		name = other.name;
		newAddress = new AddressWithCountry(other.newAddress);
	}

	@Override
	public String toString() {
		return "newEmployee [name=" + name + ", newAddress=" + newAddress + "]";
	}
	
	
}
