import java.time.LocalDate;

public class Person {

	String name;
	LocalDate dateOfBirth;

	public Person(String name, LocalDate localDate) {
		this.name = name;
		this.dateOfBirth = localDate;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dateOfBirth=" + dateOfBirth + "]";
	}
}
