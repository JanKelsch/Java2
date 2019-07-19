import java.util.List;

public class Person {
	private String name;
	private List<String> bankAccounts;
	
	public Person(String name, List<String> bankAccounts) {
		this.name = name;
		this.bankAccounts = bankAccounts;
	}

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

	public List<String> getBankAccounts() {
		return bankAccounts;
	}
}