import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Demo2 {
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	public static void main(String[] args) {
		
		copyFile("D:\\sumOfInt.txt", "D:\\Temp\\sumOfInt2.txt"); // #1

		File file2 = new File("Persons2.txt");
		sortByPrice(file2); // #2

		File file3 = new File("Persons3.txt");
		sortByAge(file3); // #3

	}
	
	public static void copyFile(String from, String to) { // #1
		try (FileInputStream in = new FileInputStream(from);
			FileOutputStream out = new FileOutputStream(to)) {
			int input;
			while ((input = in.read()) > 0) {
				out.write(input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void sortByPrice(File file) { // #2
		try (BufferedReader reader = new BufferedReader(new FileReader(file));
				PrintWriter writer = new PrintWriter("PriceOut.txt")) {
			Map<String, Integer> collect = reader.lines()
				.map(Demo2::stringToPerson)
				.collect(Collectors.groupingBy(Person2::getName, 
					Collectors.summingInt(Person2::getGadgetPrice))); 
							
			List<Entry<String, Integer>> entries = new ArrayList<>(collect.entrySet());
			entries.sort(Entry.comparingByValue());	
			
			entries.forEach(e -> writer.println((e.getKey() + " " + e.getValue())));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static int sumOfInt(BufferedReader br) { // #2
		return br.lines()
				.mapToInt(Integer::parseInt)
				.sum();
	}

	public static String createString2(Person2 person) { // #2
		return person.getName() + "," + person.getGadgetPrice();
	}

	public static Person2 stringToPerson(String s) { // #2
		String[] split = s.split(",");
		Person2 person = new Person2(split[0], Integer.parseInt(split[2]));
		return person;
	}

	public static void sortByAge(File file) { // #3
		try (BufferedReader reader = new BufferedReader(new FileReader(file));
				PrintWriter writer = new PrintWriter("PersonsOut.txt")) {
			reader.lines()
				.map(Demo2::createPerson)
				.sorted(Comparator.comparing(Person::getDateOfBirth))
				.forEach(p -> writer.println(createString(p)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Person createPerson(String string) { // #3
		String[] data = string.split(",");
		return new Person(data[0], LocalDate.parse(data[1], formatter));
	}

	public static String createString(Person person) { // #3
		return person.getName() + "," + person.getDateOfBirth().format(formatter);
	}
}
