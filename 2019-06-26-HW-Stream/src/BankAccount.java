public class BankAccount {
	String IBANN;
	Person owner;

	public BankAccount(String iBANN, Person owner) {
		IBANN = iBANN;
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "BankAccount [IBANN = " + IBANN + ", owner = " + owner + "]";
	}

	public String getIBANN() {
		return IBANN;
	}

	public Person getOwner() {
		return owner;
	}
}