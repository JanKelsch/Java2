public class Person implements Comparable<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name= " + name + ", age= " + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		if (age > o.age) {
			return 1;
		} else if (age < o.age) {
			return -1;
		}
		return 0;
	}
}