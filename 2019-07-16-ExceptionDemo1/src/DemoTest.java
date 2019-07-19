import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DemoTest {

    @Test
    public void testIsEven() throws Exception {
        String input = "abcd"; //true

        int result = Demo.getEvenStringLength(input);

        assertEquals(4, result);
    }

    @Test(expected = InvalidStringException.class)
    public void testIsNotEvent() throws Exception {
        String input = "abcde"; //true

        int result = Demo.getEvenStringLength(input);

    }
}
