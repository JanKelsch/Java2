import java.util.Comparator;

public class InnerClassDemo {

	public static void main(String[] args) {

		StringByLengthComparator sc = new StringByLengthComparator();
	}

	private static class StringByLengthComparator implements Comparator<String> {
		@Override
		public int compare(String s, String t1) {
			if (s.length() > t1.length()) {
				return 1;
			} else if (s.length() < t1.length()) {
				return -1;
			}
			return 0;
		}
	}
}
