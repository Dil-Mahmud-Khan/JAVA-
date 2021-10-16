



	
	import java.lang.*;
	
	
	public class Inheritance{
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
	
			
			
			
			
			
		
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	