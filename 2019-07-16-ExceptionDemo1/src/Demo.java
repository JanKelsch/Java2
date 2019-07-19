public class Demo {

	public static void main(String[] args) throws Exception {

		try {
			int len = getEvenStringLength("abcde");
			System.out.println(len);
		} finally {
			System.out.println("Fine anyway");
		}

		System.out.println("All fine!");
	}

	// if length is even -> return length
	// throw invalid string exception
	public static int getEvenStringLength(String input) throws InvalidStringException {
		if (input.length() % 2 == 0) {
			return input.length();
		} else {
			throw new InvalidStringException("Invalid length: " + input.length());
		}
	}

}
