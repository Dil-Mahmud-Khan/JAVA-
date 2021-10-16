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

public class savingAccount extends Accounts{
		private int interestRate;
		
		public savingAccount(){
			super();
		}
		
		public savingAccount(String accountHolderName,int accountID, double balance,int tenureYear,int interestRate){
			super(accountHolderName,accountID,balance,tenureYear);
			{
				System.out.println("parameter constructor 5");
				this.interestRate=interestRate;
			}
		}
			
		public void setinterestRate(int interestRate)
		{
			this.interestRate= interestRate;
		}
		
		public int getinterestRate(){return interestRate;}
		
	public void showDetails(){
		System.out.println("      savingAccount CLASS     ");
		System.out.println(" Account Holder Name : " +accountHolderName);
		System.out.println("Account ID : 455 "+accountID);
		System.out.println(" Balance : 56000 "+balance);
		System.out.println(" Tenure Year : "+tenureYear);
		System.out.println(" Saving Account : "+interestRate);
	}
	}
public class Inherit{
		public static void main(String [] args){
			
			Accounts a1=new Accounts();
			a1.showDetails();
			
			Accounts a2 = new Accounts("DIL",455);
			a2.showDetails();
			
			Account2 a3= new Account2("DIL",455,56000.0);
			a3.showDetails();
			
			Account2 a4= new Account2("DIL",455,56000.0,4);
			a4.showDetails();
			
			savingAccount s1=new  savingAccount("DIL",455,56000.0,4,9);
			s1.showDetails();
		}
	}
	






















