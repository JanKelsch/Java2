import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		List<String> dates = Arrays.asList("2011-07-08", "2009-07-07", "2018-11-09");

		List<String> list = reformatDates(dates);
		System.out.println(list);

		List<String> list2 = reformatAndSortDates(dates);
		System.out.println(list2);
	}

	public static List<String> reformatDates(List<String> input) {
		DateTimeFormatter formatIn = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter formatOut = DateTimeFormatter.ofPattern("dd MMMM - yyyy EEEE", Locale.ENGLISH);
		return input
				.stream()
				.map(s -> LocalDate.parse(s, formatIn))
				.map(formatOut::format)
				.collect(Collectors.toList());
	}

	public static List<String> reformatAndSortDates(List<String> input) {
		DateTimeFormatter formatIn = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter formatOut = DateTimeFormatter.ofPattern("dd MMMM - yyyy EEEE", Locale.ENGLISH);
		return input.stream()
				.map(s -> LocalDate.parse(s, formatIn))
				.sorted()
				.map(formatOut::format)
				.collect(Collectors.toList());
	}
}