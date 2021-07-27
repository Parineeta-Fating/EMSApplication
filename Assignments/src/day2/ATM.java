package day2;

//import java.lang.*;
public interface ATM 
{
	public void withdraw(int accountNumber, double amount);
	public void changePassword(int accountNumber,String oldPassword,String newPassword);
	public void checkBalance();
	
}
class SbiAtm implements ATM
{
	public void withdraw(int accountNumber, double amount)
	{
		System.out.println("Account number" +accountNumber);
		System.out.println("Amount" +amount);
	}

	@Override
	public void changePassword(int accountNumber, String oldPassword, String newPassword) 
	{
		// TODO Auto-generated method stub
		System.out.println("Account number: " +accountNumber);
		System.out.println("Old Password: "+oldPassword);
		System.out.println("New Password: "+newPassword);
	}

	@Override
	public void checkBalance() 
	{
		// TODO Auto-generated method stub
		withdraw(0, 0);
	}
	
	class Account
	{
		public void main(String[] args)
		{
			SbiAtm obj = new SbiAtm();
			obj.withdraw(123, 9000);
			obj.changePassword(123, "Pass", "Pass123");
			obj.checkBalance();
			
			
		}
	}
}
