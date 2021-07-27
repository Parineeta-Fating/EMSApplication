package day1;

public class BankDetail {
	private String accountNo;
	private int accountBalance;
	private String accountPassword;
	private static String bankName = "HDFC";
	
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getAccount() {
		return accountBalance;
	}
	public void setAccount(int accountLong) {
		this.accountBalance = accountLong;
	}
	public String getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	public static String getBankName() {
		return bankName;
	}
	public static void setBankName(String bankName) {
		BankDetail.bankName = bankName;
	}
	
	public BankDetail(String accountNo, int accountLong, String accountPassword) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountLong;
		this.accountPassword = accountPassword;
	}
	@Override
	public String toString() {
		return "Bank Detail [accountNo=" + accountNo + ", accountLong=" + accountBalance
				+ ", accountPassword=" + accountPassword + "] Bank Name"+bankName;
	}
	
	
	

}