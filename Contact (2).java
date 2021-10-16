import java.lang.*;

class Contacts{
	private String personName;
	private String personId;
	private int age;
	private String mobileNumber;
	private char gender;
	
	public Contacts()
	{
	}
	
	public Contacts(String a, String b, int c, String d, char e){
		personName= a;
		personId= b;
		age=c;
		mobileNumber= d;
		gender=e;
	}
	
	
	public void setpersonName(String a){personName=a;}
	public void setpersonId(String b){personId=b;}
	public void setage(int c){age=c;}
	public void setmobileNumber(String d){mobileNumber=d;}
	public void setgender(char e){gender=e;}
	
	
	public String getpersonName(){return personName;}
	public String getpersonId(){return personId;}
	public int getage(){return age;}
	public String getmobileNumber(){return mobileNumber;}
	public char getgender(){return gender;}
	
	public void ShowPersonalInfo(){
		System.out.println("Name : "+getpersonName());
		System.out.println("ID : "+getpersonId());
		System.out.println("Age : "+getage());
		System.out.println("Mobile Number : "+getmobileNumber());
		System.out.println(" Gender : "+getgender());
		System.out.println();
	}

public void DetectMobileOperator(){
	
	String number = mobileNumber.substring(0,3);
	
	if(number.equals("017")){
	
	System.out.println(" The Operator is GP");
	}
	else if( number.equals("018")){
	System.out.println("The Operator is Robi");
	
	}
	else if( number.equals("019")){
	System.out.println("The Operator is Banglalink");
	}
	
	else if( number.equals("015")){
	System.out.println("The Operator is Teletalk");
	}
	
	
	
	else {
		System.out.println("Unknown Operator");
	}
}





}
