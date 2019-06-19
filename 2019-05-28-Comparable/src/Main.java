import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("Ivan", 15);
		Person p2 = new Person("Petr", 45);
		Person p3 = new Person("Nic", 36);
		Person p4 = new Person("Oleg", 22);

		System.out.println(p1.compareTo(p2));

		Person[] persons = { p1, p2, p3, p4 };

		Arrays.sort(persons);
		for (Person p : persons) {
			System.out.println(p);
		}
		System.out.println("***************************");

		Arrays.sort(persons, new SortByNameComparator());
		for (Person o : persons) {
			System.out.println(o);
		}
	}
}
