package iact.day7.example3;

public class Account {
	
	private int accountNumber;
	private String accountName;
	private double balance;
	
	public Account(){
		
	}
	
	public Account(int an, String aname, double b){
		
		accountNumber = an;
		accountName = aname;
		balance = b;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int an) {
		accountNumber = an;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String aname) {
		accountName = aname;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double b) {
		balance = b;
	}
	
	@Override
	
	public String toString(){
		
		String s = "Account Number: " + accountNumber + "\n";
		s += "Account Name: " + accountName + "\n";
		s += "Balance" + balance + "\n";
		return s;
	}
	
	

}
