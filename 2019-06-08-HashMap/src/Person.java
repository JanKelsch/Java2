
public class Person {

	String firslName;
	String lastName;

	public Person(String firslName, String lastName) {
		this.firslName = firslName;
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firslName == null) ? 0 : firslName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (firslName == null) {
			if (other.firslName != null)
				return false;
		} else if (!firslName.equals(other.firslName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [firslName=" + firslName + ", lastName=" + lastName + "]";
	}

}
