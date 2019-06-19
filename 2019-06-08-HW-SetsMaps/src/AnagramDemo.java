import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramDemo {

	public static String[] list = { "ivan", "navi", "vani", "anna", "naan", "piotr", "nana" };
	private static Map<String, List<String>> voc = createVoc(list);

	public static void main(String[] args) {
		System.out.println(isAnagram("anna"));
	}

	public static List<String> isAnagram(String word) {
		String s = sortWord(word);
		return voc.get(s);
	}

	public static String sortWord(String s) {
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}

	public static Map<String, List<String>> createVoc(String[] chars) {
		Map<String, List<String>> map = new HashMap<>();
		for (String s : list) {
			String word = sortWord(s);
			List<String> list = map.get(word);
			if (list == null) {
				list = new ArrayList<>();
				map.put(word, list);
			}
			list.add(s);
		}
		return map;
	}
}