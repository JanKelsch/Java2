import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
	
	public static void main(String[] args) {

		File file = new File("sumOfInt.txt");
		sumOfNumbers(file); // #1
		
		List<String> s = Arrays.asList("aaa","bbbb","a","bb");
		System.out.println("2) Sorted strings: " + sortString(s)); // #2
		
		sortByAge(); // #3
		
		Customer c1 = new Customer("Chip", "Burunduk", 2);
		Customer c2 = new Customer("Dale", "Burunduk", 2);
		Customer c3 = new Customer("Joker", "BadGuy", 35);
		Customer c4 = new Customer("Batman", "Hero", 29);
		List<Customer> list = Arrays.asList(c1, c2, c3, c4);
		createFileWithSortedCustomers(list); // #4
		
	}
	
	public static void sumOfNumbers(File file) { // #1
		try (BufferedReader br1 = new BufferedReader(new FileReader(file));) {
			System.out.println("1) Sum of numbers: " + sumOfInt(br1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int sumOfInt(BufferedReader br) { // #1
		return br.lines()
				.mapToInt(Integer::parseInt)
				.sum();
	}

	public static List<String> sortString(List<String> list) { // #2
		return list.stream()
				.sorted(Comparator.comparing(String::length))
				.collect(Collectors.toList());
	}
	
	public static void sortByAge() { // #3
		try (BufferedReader br2 = new BufferedReader(new FileReader("Persons.csv"));) {
			br2.lines()
				.map(Demo1::createPersonFromString)
				.sorted(Comparator.comparing(Person::getAge))
				.forEach(p -> System.out.println("3) Sorted persons by age: " + createStringFromPerson(p)));
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public static Person createPersonFromString(String string) { // #3
		String[] data = string.split(",");
		return new Person(data[0], data[1]);
	}
	
	public static String createStringFromPerson(Person person) { // #3
		return person.getName() + "," + person.getAge();
	}
	
	public static String createStringFromCustomer(Customer customer) { // #4
		return customer.getFirstName() + ", " + customer.getAge();
	}
	
	public static void createFileWithSortedCustomers(List<Customer> list) { // #4
		try (PrintWriter writer = new PrintWriter("Customers.csv")) {
			list.stream()
				.sorted(Comparator.comparing(Customer::getAge))	
				.forEach(customer -> writer.println(createStringFromCustomer(customer)));
			System.out.println("Customers.csv is created");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
