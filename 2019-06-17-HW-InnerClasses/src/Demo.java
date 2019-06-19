import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		Person p1 = new Person("Ivan", 15);
		Person p2 = new Person("John", 45);
		Person p3 = new Person("Nick", 36);
		Person p4 = new Person("Oleg", 22);

		Person[] persons = { p1, p2, p3, p4 };

		Person.SortByNameComparator sortByName = p1.new SortByNameComparator();

		Arrays.sort(persons, sortByName);
		for (Person o : persons) {
			System.out.println(o);
		}
	}
}