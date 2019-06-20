
public class Demo {

	public static void main(String[] args) {

		Printable p = new Printer();
		p.print("Hello World");

		Printable pAnon = new Printable() {
			@Override
			public void print(String s) {
				System.out.println(s);
			}
		};

		pAnon.print("Hello Mama");

		Printable pl = s -> {
			System.out.println(s);
		};

		Countable c = (a, b) -> a + b;

		Countable c1 = (a, b) -> { // c1=c2 (different realization)
			if (a > b) {
				return a + b;
			} else {
				return a - b;
			}
		};

		Countable c2 = (a, b) -> a > b ? a + b : a - b;

		System.out.println(c.count(1, 4));
	}

}
