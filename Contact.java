import java.lang.*;

class Contact{
	private String personName;
	private String personId;
	private int age;
	private String mobileNumber;
	private char gender;
	
	public Contact()//empty constructor
	{
	}
	
	//parameterizied constructor
	public Contact(String a, String b, int c, String d, char e){
		personName= a;
		personId= b;
		age=c;
		mobileNumber= d;
		gender=e;
	}
	
	//setter method
	public void setpersonName(String a){personName=a;}
	public void setpersonId(String b){personId=b;}
	public void setage(int c){age=c;}
	public void setmobileNumber(String d){mobileNumber=d;}
	public void setgender(char e){gender=e;}
	
	//getter method
	public String getpersonName(){return personName;}
	public String getpersonId(){return personId;}
	public int getage(){return age;}
	public String getmobileNumber(){return mobileNumber;}
	public char getgender(){return gender;}
	
	//showing all contact info
	public void ShowContactInfo(){
		System.out.println("Name : "+getpersonName());
		System.out.println("ID : "+getpersonId());
		System.out.println("Age : "+getage());
		System.out.println("Mobile Number : "+getmobileNumber());
		System.out.println(" Gender : "+getgender());
		System.out.println();
	}




}
