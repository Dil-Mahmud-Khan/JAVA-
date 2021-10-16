public class FoodItem
{
	double price;     // initializing properties
	String name;
	
	public FoodItem(){
		//this is an empty construtor
	}
	public FoodItem(double price,String name)        // this is a parameterised construtor
	{
		this.price=price;
		this.name= name;
	}
	
	public void setprice(double price)   // setting methods
	{
		this.price=price;
	}
	
	public void setprice(String name)
	{
		this.name=name;
	}
	
	public double getprice(){return price;}     // getting methods
	public String getname(){return name;}
	
	
	
	public void showDetails(){                    //showing details in showDetails() method
		System.out.println(" Food Items ");
		System.out.println("Food Name : "+name);
		System.out.println(" Price : "+price);
	}
}

		