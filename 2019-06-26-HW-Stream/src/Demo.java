import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {

		Person p1 = new Person("John", 37, new Address("Banana str.", 1));
		Person p2 = new Person("Sarah", 14, new Address("Zwibeln str.", 4));
		Person p3 = new Person("Bob", 25, new Address("Apfel str.", 7));
		List<Person> persons = Arrays.asList(p1, p2, p3);

		List<Address> getAddress = persons.stream().filter(i -> i.getAge() > 17).map(Person::getAddress)
				.collect(Collectors.toList()); // #1
		System.out.println("1) Get address: " + getAddress);

		List<String> names = Arrays.asList("Tom", "Jerry", "Mickey", "Donald", "Jerry");
		List<String> noDublicates = names.stream().distinct().collect(Collectors.toList()); // #2
		System.out.println("2) No dublicates: " + noDublicates);

		Person p4 = new Person("John", 27);
		Person p5 = new Person("Sarah", 44);
		Person p6 = new Person("Bob", 15);
		Person p7 = new Person("Tom", 27);
		List<Person> persons2 = Arrays.asList(p4, p5, p6, p7);

		Map<Integer, List<String>> groupAges = persons2.stream().collect(
				Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.toList()))); // #3
		System.out.println("3) Group ages: " + groupAges);

		List<String> list = Arrays.asList("Banana, banana, give me banana or boom!".split(" "));
		long counter = list.stream().filter(s -> s.toLowerCase().startsWith("b")).count(); // #6
		System.out.println("6) Sum of the words with the same letters: " + counter);

		String s2 = "178";
		boolean isDigit = s2.chars().allMatch(Character::isDigit); // #7
		System.out.println("7) Is digital string: " + isDigit);

		int sumOfAges = persons2.stream().filter(i -> i.getAge() > 17).map(Person::getAge).reduce(0, (a, b) -> a + b); // #10
		System.out.println("10) Sum Of Ages > 17 years: " + sumOfAges);

		String legalAge = persons2.stream().filter(i -> i.getAge() > 17).map(Person::getName)
				.collect(Collectors.joining(" and ", "In Germany ", " are of legal age.")); // #11
		System.out.println("11) Legal age: " + legalAge);
	}
}