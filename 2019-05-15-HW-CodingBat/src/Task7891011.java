public class Task7891011 {

	public static void main(String[] args) {
		int[] nums = { 2, 1, 2, 3, 4, 8 };
		System.out.println("countEvens = " + countEvens(nums));
		System.out.println("*************************");

		int[] nums2 = { 0, 3, 2, 7 };
		int[] result = zeroMax(nums2);
		for (int i : result) {
			System.out.print(i + "  ");
		}
		System.out.println("= zeroMax\n*************************");

		int[] nums3 = { 1, 2, 3, 4, 5 };
		int[] result2 = shiftLeft(nums3);
		for (int i : result2) {
			System.out.print(i + "  ");
		}
		System.out.println("= shiftLeft\n*************************");
		System.out.println("nonStart = " + nonStart("Big", "Brother"));
		System.out.println("middleTwo = " + middleTwo("Watching"));
	}

	public static int countEvens(int[] nums) { // #7
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				counter++;
			}
		}
		return counter;
	}

	public static int[] zeroMax(int[] nums2) { // #8
		int max = 0;
		for (int i = nums2.length - 1; i >= 0; i--) {
			if (nums2[i] != 0 && nums2[i] % 2 != 0 && max < nums2[i]) {
				max = nums2[i];
			}
			if (nums2[i] == 0) {
				nums2[i] = max;
			}
		}
		return nums2;
	}

	public static int[] shiftLeft(int[] nums3) { // #9
		if (nums3.length > 0) {
			int first = nums3[0];
			for (int i = 0; i < nums3.length - 1; i++)
				nums3[i] = nums3[i + 1];
			nums3[nums3.length - 1] = first;
		}
		return nums3;
	}

	public static String nonStart(String a, String b) { // #10
		return a.substring(1, a.length()) + b.substring(1, b.length());
	}

	public static String middleTwo(String str) { // #11
		int half = str.length() / 2;
		return str.substring(half - 1, half + 1);
	}
}
