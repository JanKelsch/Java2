import java.util.Comparator;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public class SortByNameComparator implements Comparator<Person> {
		public int compare(Person o1, Person o2) {
			return o1.name.compareTo(o2.name);
		}
	}
	
	@Override
	public String toString() {
		return "Person [name= " + name + ", age= " + age + "]";
	}
}