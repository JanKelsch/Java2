import java.util.function.Function;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("For string (length 3) to Upper Case: " + transform("aaa BCdE eKL MnoPt", upper1, upper2));
		System.out.println("For string (length 4) to Lower Case: " + transform("aaa BCdE eKL MnoPt", lower1, lower2));
		System.out.println("For string (length 5) to Stars: " + transform("aaa BCdE eKL MnoPt", stars1, stars2));
	}

	static Predicate<String> upper1 = str -> str.length() == 3:true;
	static Predicate<String> lower1 = str -> str.length() == 4:true;
	static Predicate<String> stars1 = str -> str.length() == 5:true;

	static Function<String, String> upper2 = str -> str.toUpperCase();
	static Function<String, String> lower2 = str -> str.toLowerCase();
	static Function<String, String> stars2 = str -> str.replaceAll(".", "*");

	public static String transform(String s, Predicate<String> p, Function<String, String> f) {
		String[] words = s.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (p.test(words[i])) {
				words[i] = f.apply(words[i]);
			}
		}
		return String.join(" ", words);
	}
}