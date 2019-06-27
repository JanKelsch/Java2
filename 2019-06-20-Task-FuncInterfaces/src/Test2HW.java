import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test2HW {

	public static void main(String[] args) {
		int x = 7;
		int y = 8;
		String j = "Ice";
		String i = "Boom";

		BiFunction<Integer, Integer, Integer> bf1 = (a, b) -> a + b;
		System.out.println(bf1.apply(x, y));

		BiFunction<Integer, Integer, String> bf2 = (a, b) -> a + "" + b;
		System.out.println(bf2.apply(x, y));

		Predicate<String> pred1 = str -> str.length() == 3;
		System.out.println(pred1.test(j));

		Predicate<String> perd2 = str -> str.length() % 2 == 0;
		System.out.println(perd2.test(j));

		Consumer<String> cons1 = str -> System.out.println(str.toUpperCase());
		cons1.accept(j);

		Consumer<String> cons2 = str -> System.out.println(str.length() == 4 ? str = "****" : str);
		cons2.accept(i);

		Consumer<String> cons3 = str -> System.out.println(str = "!" + str + "!");
		cons3.accept(i);

		Supplier<String> supp = () -> "Hello World";
		System.out.println(supp.get());
	}
}