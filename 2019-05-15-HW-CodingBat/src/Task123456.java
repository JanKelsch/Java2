public class Task123456 {

	public static void main(String[] args) {

		System.out.println("We are sleeping = " + sleepIn(false, true));
		System.out.println("Diff 21 = " + diff21(23));
		System.out.println("Max int = " + intMax(17, 23, 55));
		System.out.println("endUp = " + endUp("hi there"));
		int[] a = { 1, 2, 7 };
		int[] b = { 0, 4, 7, 6 };
		System.out.println("commonEnd = " + commonEnd(a, b));
		int[] nums = { 2, 6, 9, 5, 4 };
		System.out.println("sum2 = " + sum2(nums));

	}

	public static boolean sleepIn(boolean weekday, boolean vacation) { // #1
		if (weekday == true && vacation == false)
			return false;
		else
			return true;
	}

	public static int diff21(int n) { // #2
		if (n > 21)
			return (n - 21) * 2;
		if (n == 21)
			return 0;
		else
			return 21 - n;
	}

	public static String endUp(String str) { // #3
		if (str.length() < 3)
			return str.toUpperCase();
		else
			return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
	}

	public static int intMax(int a, int b, int c) { // #4
		if (a > b && a > c)
			return a;
		if (a < b && b > c)
			return b;
		else
			return c;
	}

	public static boolean commonEnd(int[] a, int[] b) { // #5
		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1])
			return true;
		else
			return false;
	}

	public static int sum2(int[] nums) { // #6
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		else
			return nums[0] + nums[1];
	}
}
