public class Address {

	private String street;
	private int houseNumber;

	public Address(String street, int house) {
		this.street = street;
		this.houseNumber = house;
	}

	@Override
	public String toString() {
		return street + houseNumber;
	}
}