import org.junit.Test;

public class TestCode {

	@Test(expected = InvalidAgeException.class)
	public void validateCustomerInvalidAgeTest() throws Exception {
		BankAccount b1 = new BankAccount("DE11111111111111");
		Customer c1 = new Customer("Chip", 16, b1);
		BAValidator.validateCustomerAge(c1);
	}

	@Test
	public void validateCustomerValidAgeTest() throws Exception {
		BankAccount b1 = new BankAccount("DE11111111111111");
		Customer c1 = new Customer("Chip", 26, b1);
		BAValidator.validateCustomerAge(c1);
	}

	@Test(expected = InvalidLenghtIbanException.class)
	public void validateIbanInvalidLenghtTest() throws Exception {
		BankAccount b1 = new BankAccount("DE111111111");
		BAValidator.validateIbanLenght(b1);
	}

	@Test
	public void validateIbanValidLenghtTest() throws Exception {
		BankAccount b1 = new BankAccount("DE11111111111111");
		BAValidator.validateIbanLenght(b1);
	}

	@Test(expected = InvalidCountryIbanException.class)
	public void validateInvalidCountryIbanTest() throws Exception {
		BankAccount b1 = new BankAccount("UK11111111111111");
		BAValidator.validateCountryCode(b1);
	}

	@Test
	public void validateValidCountryIbanTest() throws Exception {
		BankAccount b1 = new BankAccount("DE11111111111111");
		BAValidator.validateCountryCode(b1);
	}
}
