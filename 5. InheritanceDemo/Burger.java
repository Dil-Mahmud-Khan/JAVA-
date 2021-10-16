import java.lang.*;

public class Burger extends FoodItem     // inherit from FoodItem to Burger through extends keyword
{
	
	int numberOfPatties;
	
	public Burger()     //this is an empty constructor
	
	{
		super();
	}
	
	public Burger(String name,double price,int numberOfPatties)   // this is parameterized constructor
	{
		super(price,name);   //using super to acess to parent class
		this.numberOfPatties=numberOfPatties;
	}
	
	public void setnumberOfPlates(int numberOfPatties)
	{
		this.numberOfPatties=numberOfPatties;
	}
	
	public int getnumberOfPatties(){return numberOfPatties;}
	
	public void showDetails()   // this is showDetails() method
	
	{
		System.out.println("*** Food Items*** ");
		System.out.println("Food Name : "+name);
		System.out.println("Price : "+price);
		System.out.println("Number Of Patties : " +numberOfPatties);
	}
	
	}
		
	
	