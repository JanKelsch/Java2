public class StringApp {

	public static void main(String[] args) {
		System.out.println("For string (length 3) to Upper Case: "+transform("aaa BCdE eKL MnoPt", new ToUpperCase()));
		System.out.println("For string (length 4) to Lower Case: "+transform("aaa BCdE eKL MnoPt", new ToLowerCase()));
		System.out.println("For string (length 5) to Stars: "+transform("aaa BCdE eKL MnoPt", new ToStars()));
	}

	public static String transform(String input, Transformer t) {
		String[] words = input.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (t.check(words[i])) {
				words[i] = t.transform(words[i]);
			}
		}
		return String.join(" ", words);
	}
}
