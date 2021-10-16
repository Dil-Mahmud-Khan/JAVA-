import java.lang.*;

public class Account2 extends Accounts{
	protected int tenureYear;
	
	public Account2(){
		super();
	}
	
	public Account2( String accountHolderName, int accountID, double balance,int tenureYear){
		super(accountHolderName,accountID,balance);
		System.out.println("parameter constructor 4");
			this.tenureYear= tenureYear;
	}
	
	public void setTenureYear(int tenureYear)
	{
	this.tenureYear=tenureYear;
	}
	
	public int getTenureYear(){
		return tenureYear;
	}
	
	public void showDetails(){
		System.out.println("      ACCOUNT2 CLASS     ");
		System.out.println(" Account Holder Name : " +accountHolderName);
		System.out.println("Account ID : 455 "+accountID);
		System.out.println(" Balance : 56000 "+balance);
		System.out.println(" Tenure Year : "+ tenureYear);
		
	}
}