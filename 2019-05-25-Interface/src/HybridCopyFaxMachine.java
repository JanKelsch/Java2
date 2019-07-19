public class HybridCopyFaxMachine implements Faxable, Copyable {

	public static void main(String[] args) {

		HybridCopyFaxMachine machine = new HybridCopyFaxMachine();

		Copyable copyMachine = machine;
		Faxable faxMachine = machine;

		copyMachine.copy("test");
		faxMachine.fax("test2");

	}

	@Override
	public void copy(String paper) {
		System.out.println("Copy paper " + paper);
	}

	@Override
	public void fax(String message) {
		System.out.println("Faxing message " + message);
	}
}
