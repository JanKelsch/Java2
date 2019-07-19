import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Double> list = null;
		try {
			int[] input = { 1, 2, -1, 5 };

			list = divide(input, 10);
			System.out.println("Everything went well ");
			System.out.println("And executing " + list.size());
		} catch (NegativeInputNotAllowedException ex) {
			System.out.println(ex.getMessage() + " " + ex.getNegativeIntIndex());
		} catch (CustomDividedByZeroException ex) {
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("Do this anyway");
		}

		double a = -1;
		try {
			a = divide2(10, 0);
		} finally {
			System.out.println("Ha ha ha " + a);
		}
		System.out.println("!!!");
	}

	public static List<Double> divide(int[] input, int b)
			throws NegativeInputNotAllowedException, CustomDividedByZeroException {
		// 1, 5, 0, 10
		List<Double> out = new LinkedList<>();
		for (int i = 0; i < input.length; i++) {
			if (input[i] == 0) {
				throw new CustomDividedByZeroException("Division by zero attempt!");
			} else if (input[i] < 0) {
				throw new NegativeInputNotAllowedException("Negative input is not allowed!", i);
			} else {
				out.add(new Double(b / input[i]));
			}
		}
		return out;
	}

	public static double divide2(int a, int b) {
		return a / b;
	}
}
