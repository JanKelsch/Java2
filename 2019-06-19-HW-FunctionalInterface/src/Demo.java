import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		String[] strings = { "Ferrari", "Mercedes", "Audi", "BMW" };
		
		Cars c1 = new Cars("Ferrari", 200000);
		Cars c2 = new Cars("Mercedes", 80000);
		Cars c3 = new Cars("Audi", 50000);
		Cars c4 = new Cars("BMW", 70000);
		List<Cars> list = Arrays.asList(c1,c2,c3,c4);
		
		Comparable comparable1 = (s1, s2) -> s1.length() > s2.length() ? 1 : s1.length() < s2.length() ? -1 : 0;

		Comparable comparable2 = new Comparable() {
			@Override
			public int s(String s1, String s2) {
				if (s1.length() > s2.length()) {
					return 1;
				} else if (s1.length() < s2.length()) {
					return -1;
				}
				return 0;
			}
		};
		
		Arrays.sort(list, comparable1);
		for (Cars c : list) {
			System.out.println(c);
		}
	}
}