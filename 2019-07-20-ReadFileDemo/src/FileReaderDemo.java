import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class FileReaderDemo {
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
				PrintWriter writer = new PrintWriter("out.txt")) {

			// Ivan,2018-03-09 -> Person{name=Ivan, dateOfBirth=....}
			reader.lines()
					.map(FileReaderDemo::createPerson)
					.sorted(Comparator.comparing(Person::getDateOfBirth))
					.forEach(p -> writer.println(createString(p)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Person createPerson(String string) {
		String[] data = string.split(",");
		return new Person(data[0], LocalDate.parse(data[1], formatter));
	}

	public static String createString(Person person) {
		return person.getName() + "," + person.dateOfBirth.format(formatter);
	}
}