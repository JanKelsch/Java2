import java.time.LocalDate;

public class Person {

	private String name;
	private String age;
	private LocalDate dateOfBirth;
	

	public Person(String name, String age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, LocalDate dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public String getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
}
