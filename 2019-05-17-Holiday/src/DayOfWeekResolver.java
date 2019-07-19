import java.util.Scanner;

public class DayOfWeekResolver {

	private Scanner scanner = new Scanner(System.in);
	
	public void start(){
		String dayOfWeek = readDayOfWeek();
		System.out.println("Is "+dayOfWeek+" holiday? - "+"It is "+isDayOf(dayOfWeek));
		scanner.close();
	}

	private String readDayOfWeek() {
		System.out.println("Enter a day of week..");
		return scanner.next();
	}

	private boolean isDayOf(String day) {
		DayOfWeek dayOfWeek = DayOfWeek.valueOf(day.toUpperCase());
		return isDayOf(dayOfWeek);
	}

	private boolean isDayOf(DayOfWeek day) {
		switch (day) {
		case SATURDAY:return true;
		case SUNDAY:return true;
		default:return false;
		}
	}
}
