import java.util.Arrays;
import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {

		String[] strings = { "Ferrari", "Mercedes", "Audi", "BMW" };
		
		Comparator<String> c = (a, b) -> Integer.compare(a.length(), b.length());

		Arrays.sort(strings, c);
		for (String s : strings) {
			System.out.println(s);
		}
	}
}