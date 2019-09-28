
public class AddressWithCountry {
	public String streetAddress,city,country;


	public AddressWithCountry(AddressWithCountry other) {
		this(other.streetAddress, other.city, other.country);
	}
	
	public AddressWithCountry(String streetAddress, String city, String country) {
		this.streetAddress = streetAddress;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "newAddress [streetAddress=" + streetAddress + ", city=" + city + ", country=" + country + "]";
	}
	
	
}
