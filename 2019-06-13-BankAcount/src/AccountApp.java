import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AccountApp {

	public static void main(String[] args) {

		Customer c1 = new Customer("Tom", "Johnes");
		Customer c2 = new Customer("Jim", "Carey");
		Customer c3 = new Customer("Bruce", "Mclaren");

		BankAccount ba1 = new BankAccount("qwert123", c1);
		BankAccount ba2 = new BankAccount("asdfg566", c2);
		BankAccount ba3 = new BankAccount("zxcvb789", c3);
		BankAccount ba4 = new BankAccount("qwert789", c3);

		List<BankAccount> list = Arrays.asList(ba1, ba2, ba3, ba4);

		getBAbyCustomer(list);
	}

	public static void getBAbyCustomer(List<BankAccount> list) {
		Map<String, List<BankAccount>> map = new HashMap<>();
		for (BankAccount bankAccount : list) {
			String key = bankAccount.getCustomer().getFirstName() + " " + bankAccount.getCustomer().getLastName();
			if (map.containsKey(key)) {
				List<BankAccount> ba1 = map.get(key);
				ba1.add(bankAccount);
			} else {
				List<BankAccount> ba2 = new ArrayList<>();
				ba2.add(bankAccount);
				map.put(key, ba2);
			}
		}
		map.forEach((k, v) -> System.out.println(k + ": " + v));
	}
}
