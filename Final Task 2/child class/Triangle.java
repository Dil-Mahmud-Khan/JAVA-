public class Triangle extends Shape{               //declaring inherit
	
	private double base;         //declaring variable
	private double height;
	
	public Triangle(){}                   //empty constructor
	 
	public Triangle(double base,double height){            //parameterized constructor   
		this.base=base;
		this.height=height;
	}
	
	//setter method and getter method
	public void setBase(double base){this.base=base;}
	public void setHeight(double height){this.height=height;}
	
	public double getBase(){return base;}
	public double getHeight(){return height;}
	
	
	public double area(){                     //method to declare area
		double area=0.5*base*height;
		return area;
	}
	
	  //method to show details
	public void showDetails(){
		System.out.println("Height is : "+getHeight());
		System.out.println("Base is : "+getBase());
		System.out.println("Area Of Triangle is : "+area());
	}
}