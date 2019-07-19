import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CodeTest {

	@Test
	public void testGetLenght() {
		String testInput = "Hello JUnit";
		int lenght = Code.getLenght(testInput);
		assertEquals(33, lenght);
	}

	@Test(expected = NullPointerException.class)
	public void testGetLenghtForNull() {
		String testInput = null;
		int lenght = Code.getLenght(testInput);
		assertEquals(0, lenght);
	}
}
