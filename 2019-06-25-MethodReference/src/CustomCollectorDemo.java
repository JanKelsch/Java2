import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class CustomCollectorDemo {

	public static void main(String[] args) {
		Employee p1 = new Employee("Ivan", 1500);
		Employee p2 = new Employee("Piotr", 2000);
		Employee p3 = new Employee("Maria", 2500);
		Employee p4 = new Employee("Elena", 1000);

		Supplier<Box> supp = () -> {
			System.out.println("Supplying starting value");
			return new Box(0);
		};

		BiConsumer<Box, Employee> accumulator = (result, person) -> {
			result.setAmount(result.getAmount() + person.getSalary());
			System.out.println(result.getAmount() + " " + person);
		};

		BinaryOperator<Box> combiner = (res1, res2) -> {
			System.out.println("Combining results");
			res1.setAmount(res1.getAmount() + res2.getAmount());
			return res1;
		};

		Collector<Employee, Box, Boolean> collector = Collector.of(supp, accumulator, combiner,
				b -> b.getAmount() > 50);

		Boolean result = Stream.of(p1, p2, p3, p4)
				// .parallel()
				.collect(collector);

		System.out.println("total salary in the box " + result);
		// System.out.println("total salary in the box "+box.getAmount());
	}
}