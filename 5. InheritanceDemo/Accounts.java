import java.lang.*;

public class Accounts{
	
	protected String accountHolderName;
	protected int accountID;
	protected double balance;
	
	public Accounts(){
		System.out.println("Empty Account");
		this.accountHolderName= "DIL";
		this.accountID=455;
		this.balance=588.59;
		
		
	}
	
	public Accounts(String accountHolderName,int accountID){
		this();
		System.out.println("parameter constructor 2 ");
		this.accountHolderName=accountHolderName;
		this.accountID=accountID;
		
	}
	
	public Accounts(String accountHolderName,int accountID,double balance){
		
		System.out.println("parameter constructor 3 ");
		this.accountHolderName=accountHolderName;
		this.accountID=accountID;
		this.balance= balance;
	}
	
	public void setaccountHolderName(String setaccountHolderName)
	{
	this.accountHolderName=accountHolderName;
	}
		
	public void setaccountID(int accountID)
	{
		this.accountID=accountID;
	}
	
	public void setbalance(double setbalance)
	{
		this.balance=balance;
	}
	
	public String getaccountHolderName(){return accountHolderName;}
	public int getaccountID(){return accountID;}
	public double getbalance(){return balance;}
	
	public void showDetails(){
		System.out.println("      ACCOUNT CLASS     ");
		System.out.println(" Account Holder Name : " +accountHolderName);
		System.out.println("Account ID : 455 "+accountID);
		System.out.println(" Balance : 56000 "+balance);
	}
}