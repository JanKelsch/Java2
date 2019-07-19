import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListApp {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();
		persons.add(new Person("John", new Address("Banana str.", 1)));
		persons.add(new Person("Sarah", new Address("Zwibeln str.", 4)));
		persons.add(new Person("Bob", new Address("Apfel str.", 7)));
		List<Address> addresses = getAddresses(persons);
		System.out.println("1) Addresses of all persons: " + addresses);

		List<String> list = Arrays.asList("Ivan", "Maria", "Stephan", "John", "Amalia");
		List<String> list2 = filterNames(list);
		System.out.println("2) Filter names: " + list2);

		List<Integer> num1 = Arrays.asList(1, 3, 4, 5);
		List<Integer> num2 = Arrays.asList(9, 3, 0, 5);
		List<String> equal = compare(num1, num2);
		System.out.println("3) Compare two lists: " + equal);

		List<String> letter1 = new ArrayList<>();
		letter1.add("aa");
		letter1.add("bb");
		letter1.add("cc");
		letter1.add("dd");

		List<String> letter2 = new ArrayList<>();
		letter2.add("cc");
		letter2.add("dd");
		letter2.add("aa");
		letter2.add("bb");
		System.out.println("4) Is circular two lists: " + isCircular(letter1, letter2));

		List<Integer> num3 = Arrays.asList(1, 2, 3, 4, 5);
		Collections.reverse(num3); // #5
		System.out.println("5) Reverse list: " + num3);

		List<Integer> num4 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		List<Integer> num5 = new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8));
		num4.addAll(num5); // #6
		System.out.println("6) Merge two lists: " + num4);

		List<Integer> num6 = Arrays.asList(25, 7, 44, 9, 11, 2);
		System.out.println("7) Filter int: " + filterInt(num6));
	}

	private static List<Address> getAddresses(List<Person> persons) { // #1
		List<Address> addresses2 = new ArrayList<>();
		for (int i = 0; i < persons.size(); i++) {
			addresses2.add(persons.get(i).getAddress());
		}
		return addresses2;
	}

	public static List<String> filterNames(List<String> list) { // #2
		List<String> list2 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() != 4) {
				list2.add(list.get(i));
			}
		}
		return list2;
	}

	public static List<String> compare(List<Integer> num1, List<Integer> num2) { // #3
		List<String> compare = new ArrayList<>();
		for (int i = 0; i < num1.size(); i++) {
			if (num1.get(i) == num2.get(i)) {
				compare.add("Yes");
			} else {
				compare.add("No");
			}
		}
		return compare;
	}

	public static boolean isCircular(List<String> letter1, List<String> letter2) { // #4
		if (letter1.size() != letter2.size())
			return false;
		for (int i = 0; i < letter1.size(); i++) {
			String last = letter1.get(letter1.size() - 1);
			letter1.remove(letter1.size() - 1);
			letter1.add(0, last);
			if (letter1.equals(letter2)) {
				return true;
			}
		}
		return false;
	}

	public static List<Integer> filterInt(List<Integer> num6) { // #7
		List<Integer> num7 = new ArrayList<>();
		for (int i = 0; i < num6.size(); i++) {
			if (num6.get(i) < 10) {
				num7.add(num6.get(i));
			}
		}
		return num7;
	}

}