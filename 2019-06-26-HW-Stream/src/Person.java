import java.util.List;

public class Person {

	private String name;
	private int age;
	private Address address;
	private List<String> bankAccounts;
	
	public Person(String name, List<String> bankAccounts) {
		this.name = name;
		this.bankAccounts = bankAccounts;
	}

	public Person(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + ", age = " + age + ", address = " + address;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}

	public List<String> getBankAccounts() {
		return bankAccounts;
	}
}