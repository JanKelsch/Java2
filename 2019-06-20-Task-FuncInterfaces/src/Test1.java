public class Test1 {

	public static void main(String[] args) {
		int x = 7;
		int y = 8;
		String j = "Jan";

		NumberSummable s = (a, b) -> a + b;
		System.out.println(s.sum(x, y));

		StringConcate sc = (a, b) -> a + "" + b;
		System.out.println(sc.concat(x, y));

		Checkable c1 = str -> str.length() == 3;
		System.out.println(c1.check(j));

		Checkable c2 = str -> str.length() % 2 == 0;
		System.out.println(c2.check(j));

		Transformable tr = str -> str.toUpperCase();
		System.out.println(tr.modify(j));

		Transformable tr2 = str -> str.length() == 4 ? str = "****" : str;
		System.out.println(tr2.modify(j));

		Printable p = str -> System.out.println(str = "!" + str + "!");
		p.print(j);

		Producable pr = () -> "Hello World";
		System.out.println(pr.produce());
	}
}