public class Address {

	private String street;
	private int house;

	public Address(String street, int house) {
		this.street = street;
		this.house = house;
	}

	@Override
	public String toString() {
		return "Address = " + street + house;
	}
}