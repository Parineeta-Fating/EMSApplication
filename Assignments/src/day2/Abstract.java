package day2;

abstract class nAccount
{
   private int AccountNo;
   private int AccountBalance;
   private String AccountPassword;
   static String bankName="HDFC";
   abstract void withdraw(int amount);

public nAccount(int accountNo, int accountBalance, String accountPassword) {
	super();
	AccountNo = accountNo;
	AccountBalance = accountBalance;
	AccountPassword = accountPassword;
}



public nAccount() {
	super();
}



public int getAccountNo() {
	return AccountNo;
}
public void setAccountNo(int AccountNo) {
	this.AccountNo = AccountNo;
}
public int getAccountBalance() {
	return AccountBalance;
}
public void setAccountBalance(int AccountBalance) {
	this.AccountBalance = AccountBalance;
}
public String getAccountPassword() {
	return AccountPassword;
}
public void setAccountPassword(String AccountPassword) {
	this.AccountPassword = AccountPassword;
}

public void display()
{
	System.out.println("Bank Name "+bankName);
	System.out.println("nAccount Number : "+AccountNo);
	System.out.println("nAccount Balance : "+AccountBalance);
	System.out.println("nAccount Password : "+AccountPassword);
	System.out.println("_________________________________");
}

}
class nSavingsAccount extends nAccount
{
	int minimumBalance=1000;
	
	
	public nSavingsAccount() {
		super();
	}


	public nSavingsAccount(int AccountNo, int AccountBalance, String AccountPassword) {
		super(AccountNo, AccountBalance, AccountPassword);
	}


	@Override
	public void display() {
		super.display();
		System.out.println("Minimum Balance is: "+minimumBalance);
		System.out.println("________________________________");
	}


	@Override
	void withdraw(int amount) {
		if(this.getAccountBalance()>=amount)
		{
			this.setAccountBalance(this.getAccountBalance()-amount);
			System.out.println("Amount "+amount+" Rs is withdrawn successfully");
			System.out.println("Balance "+this.getAccountBalance());
		}
		else
		{
			System.out.println("Low Balance");
		} 
	}
	
	
}
class nCurrentAccount extends nAccount
{
	int overdraftLimitAmount=1200;

	public nCurrentAccount() {
		super();
	}

	public nCurrentAccount(int AccountNo, int AccountBalance, String AccountPassword) {
		super(AccountNo, AccountBalance, AccountPassword);
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Overdraft Limit Amount is : "+overdraftLimitAmount);
		System.out.println("________________________________");
	}

	@Override
	void withdraw(int amount)
	{
		if(this.getAccountBalance()>=amount)
		{
			this.setAccountBalance(this.getAccountBalance()-amount);
			System.out.println("Amount "+amount+" Rs is withdrawn successfully");
			System.out.println("Balance "+this.getAccountBalance());
		}
		else
		{
			System.out.println("Low Balance");
		} 
		
	}
	
}


public class Abstract 
{
	 public static void main(String[] args)
	 {
		nAccount a1=new nSavingsAccount(311,70040,"_rt56");
		nAccount a2=new nCurrentAccount(312,49000,"pas345@");
		nAccount a3 = new nSavingsAccount(313,50600,"8$56");
		nAccount a4 = new nCurrentAccount(314,5600,"12e#9");
		a1.display();
		a2.display();
		a3.display();
		a4.display();
		a4.withdraw(900);
		a4.display();
		a3.withdraw(13080);
		a3.withdraw(2500);
		a3.display();
		
	 } 
}