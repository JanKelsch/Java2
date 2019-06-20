public class Counter implements CountableDefault {

	@Override
	public int count(int i) {
		return ++i;
	}

	@Override
	public int value() {
		return 125;
	}

}
