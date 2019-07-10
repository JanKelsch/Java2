public class BankAccount {
	String IBAN;
	Person owner;

	public BankAccount(String iBAN, Person owner) {
		IBAN = iBAN;
		this.owner = owner;
	}
	
	public BankAccount(String iBAN) {
		IBAN = iBAN;
	}

	@Override
	public String toString() {
		return "BankAccount [IBAN = " + IBAN + ", owner = " + owner + "]";
	}

	public String getIBAN() {
		return IBAN;
	}

	public Person getOwner() {
		return owner;
	}
}
