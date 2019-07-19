public class NegativeInputNotAllowedException extends Exception {

	private int negativeIntIndex;

	public NegativeInputNotAllowedException(String message, int index) {
		super(message);
		this.negativeIntIndex = index;
	}

	public int getNegativeIntIndex() {
		return negativeIntIndex;
	}
}
