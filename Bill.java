package iact.Day9.example2;

public class Bill implements expense{
	
	private int billID;
	private String name;
	private int numberOfMonths;
	private double amount;
	
	public Bill(){
		
		
	}
	
	public Bill (int id, String n, int m, double a){
		setBillID(id);
		setName(n);
		setNumberOfMonths(m);
		setAmount(a);
		
		
		
		
	}

	public int getBillID() {
		return billID;
	}

	public void setBillID(int id) {
		billID = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public int getNumberOfMonths() {
		return numberOfMonths;
	}

	public void setNumberOfMonths(int m) {
		numberOfMonths = m;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double a) {
		amount = a;
	}

	
	@Override
	public String toString(){
		String s = String.format("%10d %-20s %-6d %8.2f", getBillID(), 
				getName(), getNumberOfMonths(), getAmount());
		return s;
	}

	@Override
	public double getMonthlyAmount() {
		
		return amount/numberOfMonths;
	}

	@Override
	public String getFullName() {
		
		return name;
		
		//return firstName + " " + lastName;
	}

	@Override
	public int getID() {
	
		return billID;
	}
}
