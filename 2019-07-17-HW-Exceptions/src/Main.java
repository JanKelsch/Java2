import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Throwable {

		BankAccount b1 = new BankAccount("FR11111111111111");
		BankAccount b2 = new BankAccount("DE222222222222");
		BankAccount b3 = new BankAccount("DE3333333333");
		BankAccount b4 = new BankAccount("UK44444444444444");

		Customer c1 = new Customer("Chip", 2, b1);
		Customer c2 = new Customer("Dale", 2, b2);
		Customer c3 = new Customer("Joker", 35, b3);
		Customer c4 = new Customer("Batman", 29, b4);

		List<Customer> list = Arrays.asList(c1, c2, c3, c4);

		BAValidator.validateCustomers(list);
	}
}
