import java.util.HashMap;

public class Test {

	public static void main(String[] args) {

		Person p = new Person("Ivan", "Petrov");
		Address a = new Address("Mira", 25);

		HashMap<Person, Address> map = new HashMap<>();

		map.put(p, a);
		System.out.println(map.get(p));

		Address address = map.get(new Person("Ivan", "Petrov"));
		System.out.println(address);
	}
}
