package day2;

public class Account 
{
   private int accountNo;
   private int accountBalance;
   private String accountPassword;
   static String bankName="HDFC";

   public Account(int accountNo, int accountBalance, String accountPassword) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountPassword = accountPassword;
	}
   
public Account() {
	super();
}

public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public int getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(int accountBalance) {
	this.accountBalance = accountBalance;
}
public String getAccountPassword() {
	return accountPassword;
}
public void setAccountPassword(String accountPassword) {
	this.accountPassword = accountPassword;
}

public void display()
{
	System.out.println("Bank Name : "+bankName);
	System.out.println("Account Number : "+accountNo);
	System.out.println("Account Balance : "+accountBalance);
	System.out.println("Account Password : "+accountPassword);
	System.out.println("_____________________________________");
}
 public static void main(String[] args)
 {
	Account a1=new Account();
	Account a2=new Account(211,145600,"pas@456");
	Account a3 = new SavingsAccount(212,390000,"pas@56f");
	Account a4 = new CurrentAccount(213,34090,"pas@67#");
	a1.display();
	a2.display();
	a3.display();
	a4.display();
	
 } 
}
class SavingsAccount extends Account
{
	int minimumBalance=1000;
	
	
	public SavingsAccount() {
		super();
	}


	public SavingsAccount(int accountNo, int accountBalance, String accountPassword) {
		super(accountNo, accountBalance, accountPassword);
	}


	@Override
	public void display() {
		super.display();
		System.out.println("Minimum Balance is :  "+minimumBalance);
		System.out.println("_____________________________________");
	}
}
class CurrentAccount extends Account
{
	int overdraftLimitAmount=1200;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(int accountNo, int accountBalance, String accountPassword) {
		super(accountNo, accountBalance, accountPassword);
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Overdraft Limit Amount is : "+overdraftLimitAmount);
		System.out.println("_____________________________________");
	}
	
}