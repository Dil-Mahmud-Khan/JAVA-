import java.lang.*;

public class AddressBook{
	private String ownerName;
	private String info;
	private int size;
	private Contact contact;
	Contact listOfContact[];
	
	public AddressBook(){//empty constructor
		this.ownerName="Dil";
		this.info="Mahmud";
	}
	
	//parameterized constructor
	public AddressBook(String ownerName,String info,int size){
		this.ownerName=ownerName;
		this.info=info;
		this.listOfContact=new Contact[size];
	}

//setter method	
public void setOwnerName(String ownerName){this.ownerName=ownerName;}
public void setInfo(String info){this.info=info;}

//getter method
public String getOwnerName(){return ownerName;}
public String getInfo(){return info;}


public void showAllContactInfo()//showing all contact
{
	
	System.out.println("Owner Name : "+getOwnerName());
	System.out.println("Owner Information : "+getInfo());
	
	boolean flag=false;
	for(int i=0;i<listOfContact.length;i++){
		if(listOfContact[i]!=null){
			listOfContact[i].ShowContactInfo();
		}
	}
}

// method to add contact
public void AddContact(Contact con){
	boolean flag=false;
	for(int i=0;i<listOfContact.length;i++){
		if(listOfContact[i]==null){
			listOfContact[i]=con;
			flag=true;
		
		break;
		}
	}
	
	
		if(flag)
		{
			System.out.println("A new Contact is added");
		}
		else
		{
			System.out.println("Contact can not be added !");
		}
}

//method to deleteContact
public void deleteContact(Contact con){
	boolean flag=false;
	for(int i=0;i<listOfContact.length;i++){
		if(listOfContact[i]!=null){
			if(listOfContact[i]==con){
				listOfContact[i]=null;
			flag=true;
			}
			break;
		}
	}
	
	
	if(flag)
		{
			System.out.println("The Contact is deleted");
		}
		else
		{
			System.out.println(" Error!!!!  No contact is available here");
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	