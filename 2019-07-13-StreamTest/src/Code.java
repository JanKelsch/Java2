import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Code {

	public static void main(String[] args) {
		
		Person p1 = new Person("John", 37, new Address("Banana str.", 1));
		Person p2 = new Person("Sarah", 14, new Address("Zwibeln str.", 4));
		Person p3 = new Person("Bob", 25, new Address("Apfel str.", 7));
		List<Person> persons = Arrays.asList(p1, p2, p3);
		System.out.println("1) Get address: " + getAddress(persons));
		
		List<String> names = Arrays.asList("Tom", "Jerry", "Mickey", "Donald", "Jerry");
		System.out.println("2) No dublicates: " + noDublicates(names));
		
		List<String> list = Arrays.asList("Banana, banana, give me banana or boom!".split(" "));
		System.out.println("6) Sum of the words with the same letters: " + sumSameWords(list));
		
		String s1 = "178";
		System.out.println("7) Is digital string: " + isDigit(s1));
		
		Person p4 = new Person("John", 27);
		Person p5 = new Person("Sarah", 44);
		Person p6 = new Person("Bob", 15);
		Person p7 = new Person("Tom", 27);
		List<Person> persons2 = Arrays.asList(p4, p5, p6, p7);
		System.out.println("10) Sum Of Ages > 17 years: " + sumOfAges(persons2));
		
		System.out.println("11) Legal age: " + legalAge(persons2));
	}

	public static List<String> getAddress(List<Person> persons) { // #1
		return persons
				.stream()
				.filter(i -> i.getAge() > 17)
				.map(p->p.getAddress().toString())
				.collect(Collectors.toList());
	}
		
	public static List<String> noDublicates(List<String> input) { // #2
		return input
				.stream()
				.distinct()
				.collect(Collectors.toList());
	}
	
	public static long sumSameWords(List<String> input){ // #6
		return input
				.stream()
				.filter(s -> s.toLowerCase().startsWith("b"))
				.count();
	}
	
	public static boolean isDigit(String input) { // #7
		return input
				.chars()
				.allMatch(Character::isDigit);
	}
	
	public static int sumOfAges(List<Person> input){ // #10
		return input
				.stream()
				.filter(i -> i.getAge() > 17)
				.map(Person::getAge)
				.reduce(0, (a, b) -> a + b);
	}

	public static String legalAge(List<Person> input) { // #11
		return input
				.stream()
				.filter(i -> i.getAge() > 17)
				.map(Person::getName)
				.collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));
	}
}