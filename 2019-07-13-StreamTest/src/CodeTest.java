import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class CodeTest {

	@Test
	public void getAddress() { // #1
		Person p1 = new Person("John", 37, new Address("Banana str.", 1));
		Person p2 = new Person("Sarah", 14, new Address("Zwibeln str.", 4));
		Person p3 = new Person("Bob", 25, new Address("Apfel str.", 7));
		List<Person> persons = Arrays.asList(p1, p2, p3);
		List<String> actual = Code.getAddress(persons);
		List<String> expect = Arrays.asList("Banana str.1", "Apfel str.7");
		assertEquals(expect, actual);
	}

	@Test
	public void noDublicates() { // #2
		List<String> names = Arrays.asList("Tom", "Jerry", "Mickey", "Donald", "Jerry");
		List<String> actual = Code.noDublicates(names);
		List<String> expect = Arrays.asList("Tom", "Jerry", "Mickey", "Donald");
		assertEquals(expect, actual);
	}

	@Test
	public void sumSameWords() { // #6
		List<String> list = Arrays.asList("Banana, banana, give me banana or boom!".split(" "));
		long actual = Code.sumSameWords(list);
		long expect = 4;
		assertEquals(expect, actual);
	}

	@Test
	public void isDigit() { // #7
		assertTrue(Code.isDigit("178"));
	}

	@Test
	public void sumOfAges() { // #10
		Person p4 = new Person("John", 27);
		Person p5 = new Person("Sarah", 44);
		Person p6 = new Person("Bob", 15);
		Person p7 = new Person("Tom", 27);
		List<Person> persons = Arrays.asList(p4, p5, p6, p7);
		long actual = Code.sumOfAges(persons);
		long expect = 98;
		assertEquals(expect, actual);
	}

	@Test
	public void legalAge() { // #11
		Person p4 = new Person("John", 27);
		Person p5 = new Person("Sarah", 44);
		Person p6 = new Person("Bob", 15);
		Person p7 = new Person("Tom", 27);
		List<Person> persons = Arrays.asList(p4, p5, p6, p7);
		String actual = Code.legalAge(persons);
		String expect = "In Germany John and Sarah and Tom are of legal age.";
		assertEquals(expect, actual);
	}
}