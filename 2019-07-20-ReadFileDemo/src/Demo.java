import java.io.BufferedReader;
import java.io.FileReader;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		try (BufferedReader bufferReader = new BufferedReader(new FileReader("test.txt"));) {
			Stream<String> lines = bufferReader.lines();
			lines.filter(s -> s.length() >= 5).sorted().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
