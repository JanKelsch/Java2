import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Demo {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();
		System.out.println(now);

		LocalDate date1 = LocalDate.of(2016, 2, 20);
		System.out.println(date1);
		LocalDate localdate = date1.plusDays(15);
		System.out.println(localdate);

		LocalDate minus = date1.minus(10, ChronoUnit.YEARS);
		System.out.println(minus);
		LocalDate plus = date1.plus(14, ChronoUnit.DAYS);
		System.out.println(plus);

		LocalDate before = LocalDate.now();
		LocalDate after = LocalDate.now().plusDays(5);
		System.out.println(before.isBefore(after));

		LocalDate parse = LocalDate.now();
		String format = parse.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(format);
		String format2 = parse.format(DateTimeFormatter.ofPattern("dd-MM-yyyy EEEE", Locale.GERMAN));
		System.out.println(format2);
	}
}
