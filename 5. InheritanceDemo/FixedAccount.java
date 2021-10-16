
import java.lang.*;

public class FixedAccount extends Account
{
	private int tenureYear;
	
	public FixedAccount(){
		super();
	}
	
	public FixedAccount(int accountNumber, String accountHolderName, double balance, int tenureYear){
		super(accountNumber,accountHolderName,balance);
		System.out.println("Parameterized FixedAccount - 4");
		this.tenureYear = tenureYear;
	}
	
	public void setTenureYear(int tenureYear)
	{
		this.tenureYear = tenureYear;
	}
	public int getTenureYear()
	{
		return tenureYear;
	}
	
	//override
	public void showDetails()
	{
		System.out.println("\n---FixedAccount Class---");
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Balance: "+balance);
		System.out.println("Tenure Year: "+ tenureYear);
		System.out.println();
	}
}