import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SetMapApp {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		list1.add("Ivan");
		list1.add("Maria");
		list1.add("Piotr");
		list1.add("Anna");
		list1.add("Maria");
		list1.add("Ivan");
		System.out.println("1(Set) Remove duplicates: " + removeDuplicates(list1));

		List<String> list2 = Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan");
		System.out.println("2(Set) Get duplicates: " + getDuplicates(list2));

		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("a", "Hello");
		map1.put("b", "World");
		System.out.println("1(Map) Merge AB: " + mergeAB(map1));

		String[] list3 = { "a", "a", "b", "b", "c" };
		System.out.println("2(Map) Word multiple: " + wordMultiple(list3));

		List<String> list4 = Arrays.asList("John", "Sarah", "Nick", "Julia", "Sarah", "John");
		System.out.println("4(Map) Get quantity: " + quantity(list4));

		String s = ("Hickory Dickory dock, the mouse ran up the clock, the clock struck one the mouse ran down, Hickory Dickory dock.");
		System.out.println("5(Map) Word counter: " + wordCounter(s));

	}

	public static List<String> removeDuplicates(List<String> input) { // #1 Set
		HashSet<String> set = new HashSet<String>();
		set.addAll(input);
		input.clear();
		input.addAll(set);
		return input;
	}

	public static List<String> getDuplicates(List<String> input) { // #2 Set
		List<String> list = new ArrayList<String>();
		Set<String> set = new HashSet<String>();
		for (String s : input) {
			if (!set.add(s)) {
				list.add(s);
			}
		}
		return list;
	}

	public static Map<String, String> mergeAB(Map<String, String> map) { // #1 Map
		if (map.containsKey("a") && map.containsKey("b")) {
			map.put("ab", map.get("a") + map.get("b"));
			return map;
		}
		return null;
	}

	public static Map<String, Boolean> wordMultiple(String[] list) { // #2 Map
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		for (int i = 0; i < list.length; i++) {
			if (map.containsKey(list[i])) {
				map.put(list[i], true);
			} else
				map.put(list[i], false);
		}
		return map;
	}

	public static Map<String, Integer> quantity(List<String> list) { // #4 Map
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String s : list) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}
		return map;
	}

	public static String wordCounter(String s) { // #5 Map
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] words = s.toLowerCase().replaceAll("[,.:!]", "").split(" ");
		String wordWithMaxTimes="";
		for (String word : words) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}
		int maxValueInMap = (Collections.max(map.values()));
		for (Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == maxValueInMap) {
				wordWithMaxTimes=entry.getKey()+" - " + entry.getValue();
			}
		}
		return wordWithMaxTimes;
	}

}
