
public final class Address {

	private String street;
	private int houseNumber;

	public Address(final String street, final int houseNumber) {
		this.street = street;
		this.houseNumber = houseNumber;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", houseNumber=" + houseNumber + "]";
	}

}
