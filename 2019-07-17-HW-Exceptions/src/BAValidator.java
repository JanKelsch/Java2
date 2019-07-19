import java.util.List;

public class BAValidator {

	public static void validateCustomers(List<Customer> customers) {
		for (Customer customer : customers) {
			try {
				validateCustomerAge(customer);
			} catch (InvalidAgeException e) {
				System.out.println(e.getMessage());
			}
			try {
				validateIbanLenght(customer.getAccount());
			} catch (InvalidLenghtIbanException e) {
				System.out.println(e.getMessage());
			}
			try {
				validateCountryCode(customer.getAccount());
			} catch (InvalidCountryIbanException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void validateCustomerAge(Customer customer) throws InvalidAgeException {
		if (customer.getAge() < 17) {
			throw new InvalidAgeException(customer.getName() + ": invalid customer age = " + customer.getAge());
		}
	}

	public static void validateIbanLenght(BankAccount bankAccount) throws InvalidLenghtIbanException {
		if (bankAccount.getIban().length() != 16) {
			throw new InvalidLenghtIbanException(
					bankAccount.getIban() + ": invalid iban lenght = " + bankAccount.getIban().length());
		}
	}

	public static void validateCountryCode(BankAccount bankAccount) throws InvalidCountryIbanException {
		if (bankAccount.getIban().substring(0, 2) != "DE") {
			throw new InvalidCountryIbanException(bankAccount.getIban() + ": invalid country code = " + bankAccount.getIban().substring(0, 2));
		}
	}
}
