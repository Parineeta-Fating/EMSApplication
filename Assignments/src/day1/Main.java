package day1;

public class Main {

	public static void main(String[] args) {
		
		Account account = new Account();
		BankDetail bankDetail = new BankDetail("345678", 7654200, "232#45!");
		
		System.out.print(account.displayAccount(bankDetail));

	}

}