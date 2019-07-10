import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		Person p1 = new Person("Guffy");
		Person p2 = new Person("Donald");
		Person p3 = new Person("Pluto");

		BankAccount b1 = new BankAccount("DE123123", p1);
		BankAccount b2 = new BankAccount("NL675341", p2);
		BankAccount b3 = new BankAccount("FR879405", p3);
		BankAccount b4 = new BankAccount("DE096342", p1);
		List<BankAccount> ba = Arrays.asList(b1, b2, b3, b4);

		Map<Person, List<String>> getIBAN = ba
				.stream()
				.collect(Collectors.groupingBy(BankAccount::getOwner, Collectors
				.mapping(BankAccount::getIBAN, Collectors.toList()))); // #4
		System.out.println("4) Get person with BA = " + getIBAN);

		Stream<BankAccount> ba2 = Stream.of(b1, b2, b3, b4);

		List<String> ibans = ba2
				.map(b -> stars(b.getIBAN()))
				.collect(Collectors.toList()); // #5
		System.out.println("5) IBANs with stars: " + ibans);

		List<String> b23 = Arrays.asList("NL675342", "FR879405");
		List<String> b24 = Arrays.asList("DE123123", "DE096342");

		Person p11 = new Person("Tom", b23);
		Person p12 = new Person("Jerry", b24);
		List<Person> p = Arrays.asList(p11, p12);

		List<String> stars = p
				.stream()
				.flatMap((x) -> stars2(x.getBankAccounts()).stream())
				.collect(Collectors.toList()); // #8-9
		System.out.println("8-9) Get IBANs with stars from Persons: " + stars);
	}

	public static String stars(String input) {
		return input.substring(0, 3) + input.replaceAll(".", "*");
	}

	public static List<String> stars2(List<String> list) {
		int i = 0;
		for (String str : list) {
			list.set(i, str.substring(0, 3) + str.replaceAll(".", "*"));
			i++;
		}
		return list;
	}
}