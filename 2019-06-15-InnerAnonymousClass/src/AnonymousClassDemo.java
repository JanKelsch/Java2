import java.util.Arrays;
import java.util.Comparator;

public class AnonymousClassDemo {
	private static String text = "Hello World";

	public static void main(String[] args) {

		Comparator<String> c = new Comparator<String>() {
			@Override
			public int compare(String s, String t1) {
				if (s.length() > t1.length()) {
					return 1;
				} else if (s.length() < t1.length()) {
					return -1;
				}
				return 0;
			}
		};

		String[] strings = { "1", "22", "333", "55555", "4444" };
		Arrays.sort(strings, c);
		for (String s : strings) {
			System.out.println(s);
		}

		String someText = "some text";
		Person p = new Person() {
			@Override
			public void sayHello() {
				System.out.println(text);
				System.out.println(someText);
			}
		};

		p.sayHello();
	}

	private static class SomeClass {
		private String value;

		public SomeClass(String value) {
			this.value = value;
		}
	}
}
