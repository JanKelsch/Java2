public class Demo {

	public static void main(String[] args) {
		DivisionResult div = div(10, 0);
		if (div.isFlag()) {
			System.out.println("something went wrong");
		} else {
			System.out.println(div.getResult());
		}
	}

	public static DivisionResult div(int a, int b) {
		if (b != 0) {
			return new DivisionResult(false, a / b);
		}
		return new DivisionResult(true, -1);
	}
}
