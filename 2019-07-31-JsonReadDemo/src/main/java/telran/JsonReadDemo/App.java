package telran.JsonReadDemo;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
	public static void main(String[] args) throws Exception {

		File file = new File("person.json");
		getPersonFromJson(file);

		// Homework:
		File file2 = new File("fairyTalePerson.json");
		getSortedFairyTalePerson(file2);
	}

	public static void getPersonFromJson(File file) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		// mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
		Person person = mapper.readValue(file, Person.class);
		System.out.println(person);
	}

	public static void getSortedFairyTalePerson(File file) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		Person[] persons = mapper.readValue(file, Person[].class);
		Arrays.sort(persons, Comparator.comparing(Person::getAge));
		System.out.println(Arrays.asList(persons));
	}
}
