import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class DateTimeTest {

	@Test
	public void testDateFormat() {
		List<String> dates = Arrays.asList("2011-07-08", "2009-07-07", "2018-11-09");
		List<String> expected = Arrays.asList("08 July - 2011 Friday", "07 July - 2009 Tuesday",
				"09 November - 2018 Friday");
		List<String> actual = Demo.reformatDates(dates);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testSortedDateFormat() {
		List<String> dates = Arrays.asList("2011-07-08", "2009-07-07", "2018-11-09");
		List<String> expected = Arrays.asList("07 July - 2009 Tuesday", "08 July - 2011 Friday",
				"09 November - 2018 Friday");
		List<String> actual = Demo.reformatAndSortDates(dates);
		Assert.assertEquals(expected, actual);
	}
}