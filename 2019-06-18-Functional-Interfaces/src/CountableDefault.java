public interface CountableDefault {

	int count(int i);

	default int value() {
		return 10;
	}
}
