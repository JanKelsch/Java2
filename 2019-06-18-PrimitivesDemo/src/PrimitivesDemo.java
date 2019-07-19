import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimitivesDemo {

	static Integer test;

	public static void main(String[] args) {

		// fails with NullPointerException because cannot make int out of null
		if (test == 42) {
			System.out.println("Unbelievable!!!");
		}

		int t = 10;
		t++;

		Long a = 10L;

		// very slow code!!!
		Long counter = 0L;
		counter = 1L;
		counter = 2L;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			counter++;
		}

		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);

		System.out.println(i1 == i2);

		Integer i3 = 128;
		Integer i4 = 128;

		System.out.println(i3 == i4);

		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 128);
		List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 128);

		System.out.println(compareLists(l1, l2));

		Integer t1 = 10;
		Integer t2 = 10;

		TestComparator tc1 = new TestComparator();

		System.out.println(tc1.compare(i3, i4));

	}

	public static List<String> compareLists(List<Integer> i1, List<Integer> i2) {
		List<String> ret = new ArrayList<>();
		for (int i = 0; i < i1.size(); i++) {
			if (i1.get(i).equals(i2.get(i))) {
				ret.add("YES");
			} else {
				ret.add("NO");
			}
		}
		return ret;
	}
}