import java.util.Optional;
import java.util.function.Consumer;

public class Demo {

	public static void main(String[] args) {
		Optional<String> optional = Optional.of("Ivan");
		Consumer<String> stringConsumer = s -> System.out.println(optional.get().length());
		optional.ifPresent(stringConsumer);

		Optional<String> string = Optional.empty();
		System.out.println(string.orElse("String is empty!"));
	}
}
