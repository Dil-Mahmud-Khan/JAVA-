import java.lang.*;

public class Pizza extends FoodItem      // inherit from FoodItem to Pizza using extends keyword.
{
	String size;     // initializing property
	
	public Pizza()     //this an empty constructor
	{
		super();
	}
	
	public Pizza(String name,double price, String size)       // this is a parameterized constructor
	{     
		super(price,name);   // getting access to the parent class through super();
		
		this.size=size;
	}
	
	public void setSize(String size){
		this.size=size;
	}
	
	public String getSize(){return size;}
	
	public void showDetails()  // showDetails method to print all items
	{
		System.out.println(" ***Food Items*** ");
		System.out.println("Food Name : "+name);
		System.out.println("Price : "+price);
		System.out.println("Size : "+size);
	}
}

		