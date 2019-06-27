public class Test {

	public static void main(String[] args) {

		int[] data = { 1, 2, 3, 4, 5 };
		int sum = sum(data);
		System.out.println("Sum array = " + sum);

		int sumRec = sumInit(data);
		System.out.println("Sum array (recursion) = " + sumRec);

		int fuctRec = fuctInit(data);
		System.out.println("Fuctorial (recursion) = " + fuctRec);

		System.out.println("Reverse string (recursion) = " + reverse("abcd"));
	}

	public static int sum(final int[] a) {
		int ret = 0;
		for (int i = 0; i < a.length; i++) {
			ret = ret + a[i];
		}
		return ret;
	}

	public static int sumInit(final int[] a) {
		return sumRec(a, 0);
	}

	public static int fuctInit(final int[] a) {
		return fuctRec(a, 0);
	}

	private static int sumRec(final int[] a, int i) {
		if (i >= a.length - 1) {
			return a[a.length - 1];
		}
		return a[i] + sumRec(a, i + 1);
	}

	private static int fuctRec(final int[] a, int i) {
		if (i >= a.length - 1) {
			return a[a.length - 1];
		}
		return a[i] * fuctRec(a, i + 1);
	}

	private static String reverse(final String a) {
		if (a.isEmpty()) {
			return a;
		} else {
			return reverse(a.substring(1)) + a.charAt(0);
		}
	}
}